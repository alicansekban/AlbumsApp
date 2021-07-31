package com.alican.workapp.ui.main.albums_detail.comments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import com.alican.workapp.core.BaseAdapter
import com.alican.workapp.databinding.ItemCommentBinding
import com.alican.workapp.net.response.CommentsResponse
import com.alican.workapp.utils.util.extension.clickWithDebounce

class CommentsAdapter(
    private val callBack: ((CommentsResponse) -> Unit)?
) :
    BaseAdapter<CommentsResponse>(object :
        DiffUtil.ItemCallback<CommentsResponse>() {
        override fun areItemsTheSame(
            oldItem: CommentsResponse,
            newItem: CommentsResponse
        ): Boolean {
            return oldItem.id == newItem.id

        }

        override fun areContentsTheSame(
            oldItem: CommentsResponse,
            newItem: CommentsResponse
        ): Boolean {
            return oldItem == newItem
        }

    }) {
    override fun createBinding(parent: ViewGroup, viewType: Int): ViewDataBinding {
        val viewModel = CommentsAdapterViewModel()
        val binding: ItemCommentBinding =
            ItemCommentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        binding.viewModel = viewModel
        binding.commentsRoot.clickWithDebounce {
            binding.viewModel?.item?.get()?.let { item ->
                callBack?.invoke(item)
            }
        }
        return binding
    }

    override fun bind(binding: ViewDataBinding, position: Int) {
        (binding as ItemCommentBinding).viewModel?.item?.set(getItem(position))
        binding.executePendingBindings()
    }
}