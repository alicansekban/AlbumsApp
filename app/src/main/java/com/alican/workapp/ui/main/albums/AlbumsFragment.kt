package com.alican.workapp.ui.main.albums

import androidx.navigation.findNavController
import com.alican.workapp.R
import com.alican.workapp.core.BaseFragment
import com.alican.workapp.databinding.FragmentAlbumsBinding
import com.alican.workapp.net.response.album.AlbumResponse
import com.alican.workapp.ui.main.albums.adapter.AlbumsAdapter
import com.alican.workapp.utils.util.extension.dismissProgressDialog
import com.alican.workapp.utils.util.extension.observeWith
import com.alican.workapp.utils.util.extension.showProgressDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AlbumsFragment :
    BaseFragment<AlbumsViewModel, FragmentAlbumsBinding>(AlbumsViewModel::class.java) {
    override fun onInit() {
        binding?.albumsList?.apply {
            this.adapter = AlbumsAdapter() {
                val action =
                    AlbumsFragmentDirections.actionAlbumsFragmentToAlbumDetailFragment(it.id!!.toInt())
                findNavController().navigate(action)
            }
            setHasFixedSize(true)
        }
        binding?.viewModel?.albumResponse?.observeWith(this) {
            initAdapter(it)
        }
        binding?.viewModel?.progressLiveData?.observeWith(viewLifecycleOwner) {
            if (it) showProgressDialog() else dismissProgressDialog()
        }
    }

    private fun initAdapter(list: List<AlbumResponse?>) {
        (binding?.albumsList?.adapter as? AlbumsAdapter)?.submitList(list)
    }

    override fun getLayoutRes(): Int {
        return R.layout.fragment_albums
    }
}
