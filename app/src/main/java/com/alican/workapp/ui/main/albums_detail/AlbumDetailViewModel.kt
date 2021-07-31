package com.alican.workapp.ui.main.albums_detail

import androidx.lifecycle.viewModelScope
import com.alican.workapp.core.BaseViewModel
import com.alican.workapp.net.WorkApi
import com.alican.workapp.net.response.CommentsResponse
import com.alican.workapp.net.response.PhotosResponse
import com.alican.workapp.utils.util.ResultWrapper
import com.alican.workapp.utils.util.SingleLiveEvent
import com.alican.workapp.utils.util.safeApiCall
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AlbumDetailViewModel @Inject constructor(
    private val api: WorkApi
) : BaseViewModel() {

    val commentsResponse = SingleLiveEvent<List<CommentsResponse>>()
    val photosResponse = SingleLiveEvent<List<PhotosResponse>>()

    init {
    }

    fun getComments(id: Int) {
        progressLiveData.postValue(true)
        viewModelScope.launch {
            when (val response = safeApiCall(Dispatchers.IO) { api.getComments(id) }) {
                is ResultWrapper.Success -> {
                    commentsResponse.postValue(response.value)
                    progressLiveData.postValue(false)
                }
                is ResultWrapper.GenericError -> {
                    showGenericError(response)
                }
                else -> progressLiveData.postValue(false)
            }
        }
    }

    fun getPhotos(id: Int) {
        progressLiveData.postValue(true)
        viewModelScope.launch {
            when (val response = safeApiCall(Dispatchers.IO) { api.getPhotos(id) }) {
                is ResultWrapper.Success -> {
                    photosResponse.postValue(response.value)
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