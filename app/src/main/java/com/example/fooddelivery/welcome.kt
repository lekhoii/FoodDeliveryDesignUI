package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.welcome)
        val googlebtn=findViewById<Button>(R.id.customgooglebtn)
        val fbbtn=findViewById<Button>(R.id.customfbbtn)
        val anotherbtn=findViewById<Button>(R.id.customanotherbtn)
        val skipbtn=findViewById<Button>(R.id.skipbtn)
        val btnsignup =findViewById<Button>(R.id.signupbtn)


        googlebtn.setOnClickListener {
            Toast.makeText(applicationContext,"Sigining with google account",Toast.LENGTH_SHORT).show()
        }

        fbbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Sigining with facebook account",Toast.LENGTH_SHORT).show()
        }

        anotherbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Sigining with another method",Toast.LENGTH_SHORT).show()
        }

        skipbtn.setOnClickListener {
            Toast.makeText(applicationContext,"Skipping ",Toast.LENGTH_SHORT).show()
        }

        btnsignup.setOnClickListener {
            val intent = Intent(this@welcome, Signup::class.java)
            startActivity(intent)
            finish()
        }

    }
}