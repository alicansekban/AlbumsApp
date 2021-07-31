package com.alican.workapp.core

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alican.workapp.net.ErrorResponse
import com.alican.workapp.utils.util.ResultWrapper

open class BaseViewModel : ViewModel() {
    val progressLiveData: MutableLiveData<Boolean> = MutableLiveData()
    val errorResponse: MutableLiveData<ErrorResponse> = MutableLiveData()


    fun showGenericError(response: ResultWrapper<ResultWrapper.GenericError>): String {
        progressLiveData.postValue(false)
        errorResponse.postValue((response as ResultWrapper.GenericError).error)
        return response.toString()
    }

}