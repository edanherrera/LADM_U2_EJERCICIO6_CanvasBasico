package mx.tecnm.tepic.ladm_u2_ejercicio6_canvasbasico

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(este:MainActivity): View(este){
    var este = este
    override fun onDraw(c: Canvas) {//Cuándo se coloca ? significa que puede ser nulo !! para utilizarlo
        super.onDraw(c)
        var p = Paint()
        val color = Color.rgb(100,237,9)
        c.drawColor(color)
        p.textSize = 90f
        p.color = Color.BLUE
        c.drawText("Lemuciano",100f,120f,p)

        p.color = Color.WHITE
        este.setTitle("ancho ${width} alto ${height}")
        c.drawRect(300f,960f,700f,1160f,p)

        p.style = Paint.Style.STROKE
        p.strokeWidth = 10f
        p.color = Color.BLUE
        c.drawRect(300f,960f,700f,1160f,p)

        Paint.Style.FILL
    }
}