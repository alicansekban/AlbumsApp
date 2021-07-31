package com.alican.workapp.net.response.album

import android.os.Parcelable
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @Json(name = "userId")
    val userId: String? = null,

    @Json(name = "id")
    val id: String? = null,

    @Json(name = "title")
    val title: String? = null
) : Parcelable {
}