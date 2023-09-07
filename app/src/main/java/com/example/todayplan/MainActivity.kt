package com.example.todayplan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)
        val button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener{
            val intent = Intent(this, secondActivity::class.java)
            startActivity(intent)



        }
        button2.setOnClickListener{
            val intent2 = Intent(this, aboutActivity::class.java)
            startActivity(intent2)
        }
    }
}