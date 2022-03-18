package com.example.fooddelivery

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class userprofile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.userprofile)
        val btnshowpass = findViewById<Button>(R.id.btnshowpass)
        val bundle = intent.extras
        bundle?.let {
            val userid = it.getString(Constants.KEY_USERID)
            val email = it.getString(Constants.KEY_EMAIL)
            val password = it.getString(Constants.KEY_PASSWORD)
            val textView1 = findViewById<TextView>(R.id.textView1)
            val textViewHide = findViewById<TextView>(R.id.textViewHide)
            textView1.text = "$userid------$email"
            btnshowpass.setOnLongClickListener {
                textViewHide.text = "$password"
                true
            }

        }
    }
}