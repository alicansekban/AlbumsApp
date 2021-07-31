package com.alican.workapp.ui.main.albums_detail.comments

import androidx.databinding.ObservableField
import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.net.response.CommentsResponse
import javax.inject.Inject

class CommentsAdapterViewModel @Inject constructor() : BaseViewModel() {
    val item = ObservableField<CommentsResponse>()
}