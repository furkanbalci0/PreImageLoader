package com.furkanbalci.preimageloader.util

import androidx.core.graphics.toColorInt
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

object ImageLoaderBuilder {

    //Properties
    var errorColor = "#FF4760".toColorInt()

    var options: RequestOptions = RequestOptions()
        .error(errorColor)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .centerCrop()

}