package com.sanzzuns.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_HORIZONTAL
            setPadding(32, 48, 32, 32)
            setBackgroundColor(Color.rgb(18, 18, 18))
        }

        val title = TextView(this).apply {
            text = "sanZzuns"
            textSize = 30f
            setTextColor(Color.rgb(0, 255, 204))
        }

        val info = TextView(this).apply {
            text = "AI lokal sanZzuns\n\nAplikasi berhasil dibuka. Mesin AI lokal belum terpasang."
            textSize = 16f
            setTextColor(Color.WHITE)
            setPadding(0, 24, 0, 24)
        }

        val input = EditText(this).apply {
            hint = "Tulis pertanyaan..."
            setTextColor(Color.WHITE)
            setHintTextColor(Color.LTGRAY)
        }

        val button = Button(this).apply {
            text = "Kirim"
            setOnClickListener {
                info.text = "Mesin AI lokal belum terhubung. Pertanyaan belum diproses."
            }
        }

        layout.addView(title)
        layout.addView(info)
        layout.addView(input, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ))
        layout.addView(button)

        setContentView(layout)
    }
}
