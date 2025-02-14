package com.lucas.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cliqueBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)

        cliqueBt.setOnClickListener {
            contadorTv.text = (++contador).toString()
        }
    }
}