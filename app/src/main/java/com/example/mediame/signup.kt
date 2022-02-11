package com.example.mediame

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class signup :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        val haveanaccount=findViewById<TextView>(R.id.haveanaccountid)

        haveanaccount.setOnClickListener {
            intent= Intent(this,signin::class.java)
            startActivity(intent)
        }



    }

}