package com.mikkipastel.drawing.shape

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class ArcView @JvmOverloads constructor(
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

        val left = 100f
        val top = 100f
        val right = 200f
        val bottom = 200f
        val startAngle = 150f
        val sweepAngle = 180f
        val useCenter = false
        canvas?.drawArc(
            left, top, right, bottom, startAngle, sweepAngle, useCenter, paint
        )
    }
}