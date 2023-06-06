package com.dev_won.calculator_secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private var tvInput : TextView? = null
    var lastNumeric : Boolean = false
    var lastDot : Boolean = false
    var onDot : Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.result)
    }

    fun onDigit(view : View) {
        tvInput?.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    fun onClear(view : View) {
        tvInput?.text = ""
        lastNumeric = false
        lastDot = false
        onDot = false
    }

    fun onDecimalPoint(view : View) {
        if(lastNumeric && !lastDot && !onDot) {
            tvInput?.append(".")
            lastNumeric = false
            lastDot = true
            onDot = true
        }
    }

}