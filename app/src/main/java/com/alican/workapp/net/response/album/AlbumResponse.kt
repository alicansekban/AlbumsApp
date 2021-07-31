package com.alican.workapp.net.response.album

import android.os.Parcelable
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class AlbumResponse(

    @Json(name = "userId")
    val userId: String? = null,

    @Json(name = "id")
    val id: String? = null,

    @Json(name = "title")
    val title: String? = null
) : Parcelable
