package com.lucas.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button
    private lateinit var contadorTv: TextView
    private lateinit var inicialEt: EditText
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cliqueBt = findViewById(R.id.cliqueBt)
        contadorTv = findViewById(R.id.contadorTv)
        inicialEt = findViewById(R.id.inicial_et)

        /*
        inicialEt.addTextChangedListener(object: TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                // NSA
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // NSA
            }

            override fun afterTextChanged(s: Editable?) {

            }

        })
        */

        inicialEt.addTextChangedListener { contador = it.toString().toInt() }

        cliqueBt.setOnClickListener {
            contadorTv.text = (++contador).toString()
        }
    }
}