package com.example.randomvalue

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

import com.example.randomvaluetravis.R
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.randomButton)
        val text = findViewById<TextView>(R.id.randomNumber)
        val randomValueGenerator = RandomValueGenerator()

        button.setOnClickListener {
            val value = randomValueGenerator.generateRandomValue()
            text.text = value.toString()
        }
    }
}

