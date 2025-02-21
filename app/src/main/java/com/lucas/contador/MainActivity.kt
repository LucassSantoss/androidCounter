package com.lucas.contador

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.widget.addTextChangedListener
import com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
import com.lucas.contador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val activityMainBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activityMainBinding.root)

        with(activityMainBinding) {
            inicialSp.onItemSelectedListener = object: AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    contador = resources.getStringArray(R.array.valores_iniciais)[position].toInt()
                    contador = when(position) {
                        0 -> { 0 }
                        1 -> { 5 }
                        2 -> { 10 }
                        else -> { -1 }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // NSA
                }


            }

            cliqueBt.setOnClickListener {
                contadorTv.text = (++contador).toString()
            }
        }


    }
}