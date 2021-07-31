package com.alican.workapp.utils.util

import android.content.Context
import android.content.Intent
import android.net.Uri

object AppUtils {

    fun getOpenFacebookIntent(context: Context, url: String) {
        return try {
            context.packageManager.getPackageInfo("com.facebook.katana", 0)
            context.startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("fb://facewebmodal/f?href=$url")
                )
            )
        } catch (e: Exception) {
            context.startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        }
    }
}