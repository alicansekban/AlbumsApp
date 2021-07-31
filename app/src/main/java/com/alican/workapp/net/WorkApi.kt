package com.alican.workapp.net

import com.alican.workapp.net.response.CommentsResponse
import com.alican.workapp.net.response.PhotosResponse
import com.alican.workapp.net.response.album.AlbumResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface WorkApi {

    @GET("albums")
    suspend fun getAlbums(): List<AlbumResponse>

    @GET("albums/{albumId}/comments")
    suspend fun getComments(@Path("albumId") albumId: Int): List<CommentsResponse>

    @GET("albums/{albumId}/photos")
    suspend fun getPhotos(@Path("albumId") albumId: Int): List<PhotosResponse>
}