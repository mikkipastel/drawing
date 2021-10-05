package com.mikkipastel.drawing.shape

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class CustomTextView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint().apply {
        isAntiAlias = true
        color = Color.BLACK
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val text = "Android"
        val x = 20f
        val y = 100f
        canvas?.drawText(text, x, y, paint)
    }
}