package com.alican.workapp.ui.main.albums_detail.photos

import androidx.databinding.ObservableField
import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.net.response.PhotosResponse
import javax.inject.Inject

class PhotosAdapterViewModel @Inject constructor() : BaseViewModel() {
    val item = ObservableField<PhotosResponse>()
}