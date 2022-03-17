package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide();
        setContentView(R.layout.splash)

        val intent= Intent(applicationContext,onboarding::class.java)
        val handler=Handler(mainLooper).postDelayed({
            startActivity(intent)
        },2000)
    }
}