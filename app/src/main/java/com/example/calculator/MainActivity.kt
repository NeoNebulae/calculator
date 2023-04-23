package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.editTextNumber)
        val num2 = findViewById<EditText>(R.id.editTextNumber2)
        val addBtn = findViewById<Button>(R.id.addition)
        val subBtn = findViewById<Button>(R.id.subtraction)
        val mulBtn = findViewById<Button>(R.id.multiplication)
        val divBtn = findViewById<Button>(R.id.division)

        addBtn.setOnClickListener {
            val result = num1.text.toString().toDouble() + num2.text.toString().toDouble()
            findViewById<TextView>(R.id.Result).text = "Result: $result"
        }

        subBtn.setOnClickListener {
            val result = num1.text.toString().toDouble() - num2.text.toString().toDouble()
            findViewById<TextView>(R.id.Result).text = "Result: $result"
        }

        mulBtn.setOnClickListener {
            val result = num1.text.toString().toDouble() * num2.text.toString().toDouble()
            findViewById<TextView>(R.id.Result).text = "Result: $result"
        }

        divBtn.setOnClickListener {
            val result = num1.text.toString().toDouble() / num2.text.toString().toDouble()
            findViewById<TextView>(R.id.Result).text = "Result: $result"
        }

    }
}
