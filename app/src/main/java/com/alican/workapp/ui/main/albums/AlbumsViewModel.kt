package com.alican.workapp.ui.main.albums

import androidx.lifecycle.viewModelScope
import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.net.WorkApi
import com.alican.workapp.net.response.album.AlbumResponse
import com.alican.workapp.utils.util.ResultWrapper
import com.alican.workapp.utils.util.SingleLiveEvent
import com.alican.workapp.utils.util.safeApiCall
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumsViewModel @Inject constructor(
    private val api: WorkApi
) : BaseViewModel() {

    val albumResponse = SingleLiveEvent<List<AlbumResponse>>()

    init {
        getAlbums()
    }

    fun getAlbums() {
        progressLiveData.postValue(true)
        viewModelScope.launch {
            when (val response = safeApiCall(Dispatchers.IO) { api.getAlbums() }) {
                is ResultWrapper.Success -> {
                    albumResponse.postValue(response.value)
                    progressLiveData.postValue(false)
                }
                is ResultWrapper.GenericError -> {
                    showGenericError(response)
                }
                else -> progressLiveData.postValue(false)
            }
        }
    }
}