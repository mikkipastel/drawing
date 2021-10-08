package com.mikkipastel.drawing.custom

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class ShirtBagView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paint = Paint().apply {
        isAntiAlias = true
        color = Color.BLACK
        style = Paint.Style.STROKE
    }

    private val path = Path().apply {
        moveTo(20f, 20f)
        lineTo(40f, 20f)
        arcTo(
            RectF(40f, 5f, 70f, 35f),
            180f,
            -180f,
            false
        )
        lineTo(90f, 20f)
        lineTo(90f, 90f)
        lineTo(20f, 90f)
        close()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        canvas?.drawPath(path, paint)
    }
}