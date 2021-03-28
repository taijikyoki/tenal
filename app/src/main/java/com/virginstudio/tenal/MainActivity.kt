package com.virginstudio.tenal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_undermain: TextView = findViewById(R.id.undermain_menu_label)

        btn_undermain.setOnClickListener {
            val int: Intent = Intent(this, UndermainActivity::class.java)
            startActivity(int)
        }
    }
}