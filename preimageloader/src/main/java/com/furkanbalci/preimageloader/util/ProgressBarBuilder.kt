package com.furkanbalci.preimageloader.util

import android.widget.ImageView
import androidx.core.graphics.toColorInt
import androidx.swiperefreshlayout.widget.CircularProgressDrawable

object ProgressBarBuilder {

    //Properties
    private var radius: Float = 50f
    private var width: Float = 10f
    private var color: Int = "#FF4760".toColorInt()

    fun color(color: Int): ProgressBarBuilder {
        ProgressBarBuilder.color = color
        return this
    }

    fun stroke(width: Float, radius: Float): ProgressBarBuilder {
        ProgressBarBuilder.width = width
        ProgressBarBuilder.radius = radius
        return this
    }

    fun build(view: ImageView): CircularProgressDrawable {
        return CircularProgressDrawable(view.context).apply {

            //Change color
            setColorSchemeColors(color)
            this.strokeWidth = width
            this.centerRadius = radius
            start()
        }
    }
}