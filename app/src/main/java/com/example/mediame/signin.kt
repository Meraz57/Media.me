package com.example.mediame

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton

class signin:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)
        val signinbutton=findViewById<AppCompatButton>(R.id.signinbutton)
        signinbutton.setOnClickListener {
            intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }




}