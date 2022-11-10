package com.furkanbalci.preimageloader.extension

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.furkanbalci.preimageloader.util.ImageLoaderBuilder
import com.furkanbalci.preimageloader.util.ProgressBarBuilder

/*
* Image download extension
* @param url: String
 */
fun ImageView.download(url: String) {

    //Options
    val options = ImageLoaderBuilder.options
        .placeholder(ProgressBarBuilder.build(this))

    //Set image
    Glide.with(this.context)
        .setDefaultRequestOptions(options)
        .load(url)
        .transition(DrawableTransitionOptions.withCrossFade())
        .into(this)
}