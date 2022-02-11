package com.example.mediame

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashscreen:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen)


        Handler().postDelayed({
            val intent = Intent(this, signup::class.java)
            startActivity(intent)
            finish()
        },2500)

    }
}