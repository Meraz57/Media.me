package com.example.mediame

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val usernametext = findViewById<EditText>(R.id.usernametextid)
        val gmailtext = findViewById<EditText>(R.id.emailtextid)
        val passwordtextid = findViewById<EditText>(R.id.passwordtextid)
        val signup = findViewById<TextView>(R.id.signup)
        signup.setOnClickListener {

            if (usernametext.toString().isNotEmpty()) {
                if (gmailtext.toString().isNotEmpty()) {
                    if (passwordtextid.toString().length > 5) {
                        intent = Intent(this, signin::class.java)
                        startActivity(intent)
                    } else {
                        passwordtextid.error = "Please enter 6 password"
                    }
                } else {
                    gmailtext.error = "Please enter your email"
                }
            } else {
                usernametext.error = "Please enter your username"
            }

        }

    }

}