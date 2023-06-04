package com.dev_won.calculator_secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.result)
    }

    fun onDigit(view : View) {
        if ((view as Button).text == "0") {
            if (tvInput?.text != null) {
                tvInput?.append((view as Button).text)
            }
        }
        else {
            tvInput?.append((view as Button).text)
        }
    }

    fun onClear(view : View) {
        tvInput?.text = ""
    }
}