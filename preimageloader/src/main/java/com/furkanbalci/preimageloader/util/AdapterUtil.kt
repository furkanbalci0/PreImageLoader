package com.furkanbalci.preimageloader.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.furkanbalci.preimageloader.extension.download

@BindingAdapter("android:downloadUrl")
fun downloadUrl(view: ImageView, url: String?) {
    url?.let {
        view.download(it)
    }
}