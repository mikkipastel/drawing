package com.mikkipastel.drawing.shape

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class LineView @JvmOverloads constructor(
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

        val startX = 30f
        val startY = 30f
        val endX = 100f
        val endY = 100f
        canvas?.drawLine(
            startX,
            startY,
            endX,
            endY,
            paint
        )
    }
}