package com.alican.workapp.ui.main.albums.adapter

import androidx.databinding.ObservableField
import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.net.response.album.AlbumResponse
import javax.inject.Inject

class AlbumsAdapterViewModel @Inject constructor() : BaseViewModel() {
    val item = ObservableField<AlbumResponse>()
}