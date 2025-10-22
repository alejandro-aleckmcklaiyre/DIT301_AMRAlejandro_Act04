package com.example.eventpracticeapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText: TextInputEditText = findViewById(R.id.nameEditText)
        val ageEditText: TextInputEditText = findViewById(R.id.ageEditText)
        val submitButton: Button = findViewById(R.id.submitButton)
        val outputTextView: TextView = findViewById(R.id.outputTextView)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val ageString = ageEditText.text.toString()

            if (name.isNotEmpty() && ageString.isNotEmpty()) {
                try {
                    val age = ageString.toInt()
                    outputTextView.text = "hello $name! You are $age years old."
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Invalid age. Please enter a number.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please fill in all fields.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
