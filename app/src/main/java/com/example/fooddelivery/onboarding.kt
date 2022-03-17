package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class onboarding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.onboardingone)
        val button=findViewById<Button>(R.id.btn)
        button.setOnClickListener {
            val intent= Intent(applicationContext,welcome::class.java)
            startActivity(intent)
            finish()
        }
    }
}