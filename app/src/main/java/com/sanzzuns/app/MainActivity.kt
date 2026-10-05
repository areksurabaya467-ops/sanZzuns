package com.sanzzuns.app
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val box=LinearLayout(this).apply { orientation=LinearLayout.VERTICAL; setPadding(32,48,32,32) }
        val title=TextView(this).apply { text="sanZzuns"; textSize=30f }
        val info=TextView(this).apply { text="AI lokal • tanpa API key\n\nKerangka aplikasi berhasil dijalankan. Mesin inference llama.cpp dan model GGUF belum disertakan pada versi dasar ini."; textSize=16f }
        val input=EditText(this).apply { hint="Tulis pertanyaan..."; minLines=3 }
        val button=Button(this).apply { text="Kirim"; setOnClickListener { info.text="sanZzuns: mesin inference lokal belum terhubung pada build dasar." } }
        box.addView(title); box.addView(info); box.addView(input); box.addView(button); setContentView(box)
    }
}
