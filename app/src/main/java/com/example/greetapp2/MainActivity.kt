package com.example.greetapp2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var edittextname: EditText
    private lateinit var buttonWelcome: Button
    private lateinit var textViewWelcomeMessage: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        edittextname = findViewById(R.id.edittextname)
        buttonWelcome = findViewById(R.id.buttonWelcome)
        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage)

        buttonWelcome.setOnClickListener {
            val name = edittextname.text.toString()
            val welcomeMessage = "Welcome $name!"
            textViewWelcomeMessage.text = welcomeMessage
        }
    }
}