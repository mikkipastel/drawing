package com.mikkipastel.drawing.shape

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class RectangleView @JvmOverloads constructor(
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

        val left = 20f
        val top = 20f
        val right = 200f
        val bottom = 150f
        val rectF = RectF(
            left,
            top,
            right,
            bottom,
        )
        canvas?.drawRect(rectF, paint)
    }
}