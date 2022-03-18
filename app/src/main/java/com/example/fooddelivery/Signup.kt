package com.example.fooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val btnSignUp = findViewById<Button>(R.id.btnSignUp)
        val edtUserid = findViewById<EditText>(R.id.edtUserid)
        val edtEmail = findViewById<EditText>(R.id.edtEmail)
        val edtPassword = findViewById<EditText>(R.id.edtPassword)


        btnSignUp.setOnClickListener {
            val intent = Intent(this@Signup, userprofile::class.java)
            val bundle = Bundle()
            bundle.putString(Constants.KEY_USERID,edtUserid.text.toString().trim())
            bundle.putString(Constants.KEY_EMAIL,edtEmail.text.toString().trim())
            bundle.putString(Constants.KEY_PASSWORD,edtPassword.text.toString().trim())
            intent.putExtras(bundle)
            startActivity(intent)

        }

    }
}
