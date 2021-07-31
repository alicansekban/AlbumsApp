package com.alican.workapp.ui.main.albums_detail

import androidx.navigation.fragment.navArgs
import com.alican.workapp.R
import com.alican.workapp.core.BaseFragment
import com.alican.workapp.databinding.FragmentAlbumsDetailBinding
import com.alican.workapp.net.response.CommentsResponse
import com.alican.workapp.net.response.PhotosResponse
import com.alican.workapp.ui.main.albums_detail.comments.CommentsAdapter
import com.alican.workapp.ui.main.albums_detail.photos.PhotosAdapter
import com.alican.workapp.utils.util.extension.*
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlbumDetailFragment :
    BaseFragment<AlbumDetailViewModel, FragmentAlbumsDetailBinding>(AlbumDetailViewModel::class.java) {
    private val args: AlbumDetailFragmentArgs by navArgs()
    override fun onInit() {
        setListener()
        viewModel.getComments(args.id)
        viewModel.getPhotos(args.id)

        binding?.commentsList?.apply {
            this.adapter = CommentsAdapter() {
            }
        }
        binding?.viewModel?.commentsResponse?.observeWith(this) {
            initAdapterComments(it)
        }

        binding?.photosList?.apply {
            this.adapter = PhotosAdapter() {
            }
            setHasFixedSize(true)
        }
        binding?.viewModel?.photosResponse?.observeWith(this) {
            initAdapterPhotos(it)
        }
        binding?.viewModel?.progressLiveData?.observeWith(viewLifecycleOwner) {
            if (it) showProgressDialog() else dismissProgressDialog()
        }
    }

    private fun initAdapterComments(list: List<CommentsResponse?>) {
        (binding?.commentsList?.adapter as? CommentsAdapter)?.submitList(list)
    }

    private fun initAdapterPhotos(list: List<PhotosResponse?>) {
        (binding?.photosList?.adapter as? PhotosAdapter)?.submitList(list)
    }

    private fun setListener() {
        binding?.commentsBtn?.clickWithDebounce {
            setCommentsUI()
        }
        binding?.photosBtn?.clickWithDebounce {
            setPhotosUI()
        }
    }

    override fun getLayoutRes(): Int {
        return R.layout.fragment_albums_detail
    }

    private fun setCommentsUI() {
        binding?.commentsBtn?.setBackgroundColor(resources.getColor(R.color.white))
        binding?.photosBtn?.setBackgroundColor(resources.getColor(R.color.segment_bg))

        binding?.commentsTxt?.setTextColor(resources.getColor(R.color.blue_action))
        binding?.photosTxt?.setTextColor(resources.getColor(R.color.text_color_gray))
        binding?.commentsList?.show()
        binding?.photosList?.invisible()

    }

    private fun setPhotosUI() {
        binding?.commentsBtn?.setBackgroundColor(resources.getColor(R.color.segment_bg))
        binding?.photosBtn?.setBackgroundColor(resources.getColor(R.color.white))

        binding?.commentsTxt?.setTextColor(resources.getColor(R.color.text_color_gray))
        binding?.photosTxt?.setTextColor(resources.getColor(R.color.blue_action))
        binding?.commentsList?.invisible()
        binding?.photosList?.show()
    }
}