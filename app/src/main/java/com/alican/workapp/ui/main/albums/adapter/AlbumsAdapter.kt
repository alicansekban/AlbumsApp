package com.alican.workapp.ui.main.albums.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.alican.workapp.core.BaseAdapter
import com.alican.workapp.databinding.ItemAlbumBinding
import com.alican.workapp.net.response.album.AlbumResponse
import com.alican.workapp.utils.util.extension.clickWithDebounce

class AlbumsAdapter(
    private val callBack: ((AlbumResponse) -> Unit)?
) :
    BaseAdapter<AlbumResponse>(object :
        DiffUtil.ItemCallback<AlbumResponse>() {
        override fun areItemsTheSame(oldItem: AlbumResponse, newItem: AlbumResponse): Boolean {
            return oldItem.id == newItem.id

        }

        override fun areContentsTheSame(oldItem: AlbumResponse, newItem: AlbumResponse): Boolean {
            return oldItem == newItem
        }
    }) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val viewModel = AlbumsAdapterViewModel()
        val binding: ItemAlbumBinding =
            ItemAlbumBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding.viewModel = viewModel
        binding.albumRoot.clickWithDebounce {
            binding.viewModel?.item?.get()?.let { item ->
                callBack?.invoke(item)
            }
        }
        return binding
    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemAlbumBinding).viewModel?.item?.set(getItem(position))
        binding.executePendingBindings()
    }
}