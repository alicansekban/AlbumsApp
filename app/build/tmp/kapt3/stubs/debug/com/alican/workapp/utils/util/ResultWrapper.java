package com.alican.workapp.utils.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u000f\u0010\u0011\u0012B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002JC\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\t\u001a\u00020\n2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0001\u0004\u0013\u0014\u0015\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/alican/workapp/utils/util/ResultWrapper;", "T", "", "()V", "convertErrorBody", "Lcom/alican/workapp/net/ErrorResponse;", "throwable", "Lretrofit2/HttpException;", "safeApiCall", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "apiCall", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "GenericError", "Loading", "NetworkError", "Success", "Lcom/alican/workapp/utils/util/ResultWrapper$Loading;", "Lcom/alican/workapp/utils/util/ResultWrapper$Success;", "Lcom/alican/workapp/utils/util/ResultWrapper$GenericError;", "Lcom/alican/workapp/utils/util/ResultWrapper$NetworkError;", "app_debug"})
public abstract class ResultWrapper<T extends java.lang.Object> {
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>java.lang.Object safeApiCall(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.alican.workapp.utils.util.ResultWrapper<? extends T>> p2) {
        return null;
    }
    
    private final com.alican.workapp.net.ErrorResponse convertErrorBody(retrofit2.HttpException throwable) {
        return null;
    }
    
    private ResultWrapper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/alican/workapp/utils/util/ResultWrapper$Loading;", "Lcom/alican/workapp/utils/util/ResultWrapper;", "", "()V", "app_debug"})
    public static final class Loading extends com.alican.workapp.utils.util.ResultWrapper {
        @org.jetbrains.annotations.NotNull()
        public static final com.alican.workapp.utils.util.ResultWrapper.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00028\u0001H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001H\u00c6\u0001\u00a2\u0006\u0002\u0010\nJ\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0013"}, d2 = {"Lcom/alican/workapp/utils/util/ResultWrapper$Success;", "T", "Lcom/alican/workapp/utils/util/ResultWrapper;", "value", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/alican/workapp/utils/util/ResultWrapper$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.alican.workapp.utils.util.ResultWrapper<T> {
        private final T value = null;
        
        public final T getValue() {
            return null;
        }
        
        public Success(T value) {
            super();
        }
        
        public final T component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.alican.workapp.utils.util.ResultWrapper.Success<T> copy(T value) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lcom/alican/workapp/utils/util/ResultWrapper$GenericError;", "Lcom/alican/workapp/utils/util/ResultWrapper;", "", "code", "", "error", "Lcom/alican/workapp/net/ErrorResponse;", "(Ljava/lang/Integer;Lcom/alican/workapp/net/ErrorResponse;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Lcom/alican/workapp/net/ErrorResponse;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/alican/workapp/net/ErrorResponse;)Lcom/alican/workapp/utils/util/ResultWrapper$GenericError;", "equals", "", "other", "", "hashCode", "toString", "", "app_debug"})
    public static final class GenericError extends com.alican.workapp.utils.util.ResultWrapper {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.Integer code = null;
        @org.jetbrains.annotations.Nullable()
        private final com.alican.workapp.net.ErrorResponse error = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer getCode() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.alican.workapp.net.ErrorResponse getError() {
            return null;
        }
        
        public GenericError(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        com.alican.workapp.net.ErrorResponse error) {
            super();
        }
        
        public GenericError() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.alican.workapp.net.ErrorResponse component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.alican.workapp.utils.util.ResultWrapper.GenericError copy(@org.jetbrains.annotations.Nullable()
        java.lang.Integer code, @org.jetbrains.annotations.Nullable()
        com.alican.workapp.net.ErrorResponse error) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/alican/workapp/utils/util/ResultWrapper$NetworkError;", "Lcom/alican/workapp/utils/util/ResultWrapper;", "", "()V", "app_debug"})
    public static final class NetworkError extends com.alican.workapp.utils.util.ResultWrapper {
        @org.jetbrains.annotations.NotNull()
        public static final com.alican.workapp.utils.util.ResultWrapper.NetworkError INSTANCE = null;
        
        private NetworkError() {
            super();
        }
    }
}