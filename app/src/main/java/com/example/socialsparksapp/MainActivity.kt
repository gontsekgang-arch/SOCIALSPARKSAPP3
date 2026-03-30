package com.example.socialsparksapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var edtTime: EditText
    lateinit var btnSugggest: Button
    lateinit var btnReset: Button
    lateinit var txtResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        edtTime = findViewById(R.id.txtedtTime)
        btnSugggest = findViewById(R.id.btnSuggest)
        btnReset = findViewById(R.id.btnReset)
        txtResult = findViewById(R.id.txtResult)

//Suggest button logic
        btnSugggest.setOnClickListener {
            val time = edtTime.text.toString().lowercase()
            if (time == "morning") {
                txtResult.text = "Send a Good Morning text to a family member"
            } else if (time == "mid-morning") {
            }
            txtResult.text = "Send a quick 'Thank you' to a collegue"
            {}
            if (time == "afternoon") {
                if (time == "snack time") {
                    txtResult.text = "Send a 'Thinking about you' message"
                    if (time == "dinner")
                        txtResult.text = "Call a friend for 5-minutes catch-up"
                    else if (time == "night")
                        txtResult.text = "Please enter a valid time of the day!"
                }
            }
        }
    }
}















