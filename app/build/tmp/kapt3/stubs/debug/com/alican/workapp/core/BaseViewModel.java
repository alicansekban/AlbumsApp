package com.alican.workapp.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/alican/workapp/core/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "errorResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/alican/workapp/net/ErrorResponse;", "getErrorResponse", "()Landroidx/lifecycle/MutableLiveData;", "progressLiveData", "", "getProgressLiveData", "showGenericError", "", "response", "Lcom/alican/workapp/utils/util/ResultWrapper;", "Lcom/alican/workapp/utils/util/ResultWrapper$GenericError;", "app_debug"})
public class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> progressLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.alican.workapp.net.ErrorResponse> errorResponse = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getProgressLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.alican.workapp.net.ErrorResponse> getErrorResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String showGenericError(@org.jetbrains.annotations.NotNull()
    com.alican.workapp.utils.util.ResultWrapper<com.alican.workapp.utils.util.ResultWrapper.GenericError> response) {
        return null;
    }
    
    public BaseViewModel() {
        super();
    }
}