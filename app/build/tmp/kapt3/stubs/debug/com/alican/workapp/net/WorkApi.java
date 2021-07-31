package com.alican.workapp.net;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/alican/workapp/net/WorkApi;", "", "getAlbums", "", "Lcom/alican/workapp/net/response/album/AlbumResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getComments", "Lcom/alican/workapp/net/response/CommentsResponse;", "albumId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPhotos", "Lcom/alican/workapp/net/response/PhotosResponse;", "app_debug"})
public abstract interface WorkApi {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "albums")
    public abstract java.lang.Object getAlbums(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.alican.workapp.net.response.album.AlbumResponse>> p0);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "albums/{albumId}/comments")
    public abstract java.lang.Object getComments(@retrofit2.http.Path(value = "albumId")
    int albumId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.alican.workapp.net.response.CommentsResponse>> p1);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "albums/{albumId}/photos")
    public abstract java.lang.Object getPhotos(@retrofit2.http.Path(value = "albumId")
    int albumId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.alican.workapp.net.response.PhotosResponse>> p1);
}