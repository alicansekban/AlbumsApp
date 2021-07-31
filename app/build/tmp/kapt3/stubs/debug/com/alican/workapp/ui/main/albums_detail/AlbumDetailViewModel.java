package com.alican.workapp.ui.main.albums_detail;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/alican/workapp/ui/main/albums_detail/AlbumDetailViewModel;", "Lcom/alican/workapp/core/BaseViewModel;", "api", "Lcom/alican/workapp/net/WorkApi;", "(Lcom/alican/workapp/net/WorkApi;)V", "commentsResponse", "Lcom/alican/workapp/utils/util/SingleLiveEvent;", "", "Lcom/alican/workapp/net/response/CommentsResponse;", "getCommentsResponse", "()Lcom/alican/workapp/utils/util/SingleLiveEvent;", "photosResponse", "Lcom/alican/workapp/net/response/PhotosResponse;", "getPhotosResponse", "getComments", "", "id", "", "getPhotos", "app_debug"})
public final class AlbumDetailViewModel extends com.alican.workapp.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.CommentsResponse>> commentsResponse = null;
    @org.jetbrains.annotations.NotNull()
    private final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.PhotosResponse>> photosResponse = null;
    private final com.alican.workapp.net.WorkApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.CommentsResponse>> getCommentsResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.PhotosResponse>> getPhotosResponse() {
        return null;
    }
    
    public final void getComments(int id) {
    }
    
    public final void getPhotos(int id) {
    }
    
    @javax.inject.Inject()
    public AlbumDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.alican.workapp.net.WorkApi api) {
        super();
    }
}