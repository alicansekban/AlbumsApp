package com.alican.workapp.ui.main.albums;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/alican/workapp/ui/main/albums/AlbumsViewModel;", "Lcom/alican/workapp/core/BaseViewModel;", "api", "Lcom/alican/workapp/net/WorkApi;", "(Lcom/alican/workapp/net/WorkApi;)V", "albumResponse", "Lcom/alican/workapp/utils/util/SingleLiveEvent;", "", "Lcom/alican/workapp/net/response/album/AlbumResponse;", "getAlbumResponse", "()Lcom/alican/workapp/utils/util/SingleLiveEvent;", "getAlbums", "", "app_debug"})
public final class AlbumsViewModel extends com.alican.workapp.core.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.album.AlbumResponse>> albumResponse = null;
    private final com.alican.workapp.net.WorkApi api = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.alican.workapp.utils.util.SingleLiveEvent<java.util.List<com.alican.workapp.net.response.album.AlbumResponse>> getAlbumResponse() {
        return null;
    }
    
    public final void getAlbums() {
    }
    
    @javax.inject.Inject()
    public AlbumsViewModel(@org.jetbrains.annotations.NotNull()
    com.alican.workapp.net.WorkApi api) {
        super();
    }
}