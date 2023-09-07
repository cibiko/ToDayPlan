package com.example.todayplan

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class aboutActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
        val button3 = findViewById<Button>(R.id.button3)

        button3.setOnClickListener{
            val intentt = Intent(this,secondActivity::class.java)
            startActivity(intentt)
        }
    }



}
