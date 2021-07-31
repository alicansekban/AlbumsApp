package com.alican.workapp.ui.main.albums_detail.photos

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.alican.workapp.R
import com.alican.workapp.databinding.ItemPhotoBinding
import com.alican.workapp.net.response.PhotosResponse
import com.alican.workapp.utils.util.extension.clickWithDebounce

class PhotosAdapter(private val callBack: ((PhotosResponse) -> Unit)?) :
    com.alican.workapp.core.BaseAdapter<PhotosResponse>(object :
        DiffUtil.ItemCallback<PhotosResponse>() {
        override fun areItemsTheSame(oldItem: PhotosResponse, newItem: PhotosResponse): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: PhotosResponse, newItem: PhotosResponse): Boolean {
            return oldItem == newItem
        }

    }) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val viewModel = PhotosAdapterViewModel()
        val binding: ItemPhotoBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_photo, parent, false
            )
        binding.viewModel = viewModel
        binding.photosRoot.clickWithDebounce {
            binding.viewModel?.item?.get()?.let { item ->
                callBack?.invoke(item)
            }
        }
        return binding

    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemPhotoBinding).viewModel?.item?.set(getItem(position))
        binding.executePendingBindings()
    }
}