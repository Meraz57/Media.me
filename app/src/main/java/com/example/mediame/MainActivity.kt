package com.example.mediame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mediame.Fragment.*
import com.example.mediame.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomnavigation =findViewById<BottomNavigationView>(R.id.bottomnavigationid)
        val homeFragment=HomeFragment()
        val profileFragment =ProfileFragment()
        val postFragment=PostFragment()
        val notificationFragment=NotificationFragment()
        currentfragments(homeFragment)
        bottomnavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){

                R.id.homeitemid -> currentfragments(homeFragment)
                R.id.profileitemid -> currentfragments(profileFragment)
                R.id.notificationitemid -> currentfragments(notificationFragment)
                R.id.postitemid -> currentfragments(postFragment)

            }
            true

        }


    }

    private fun currentfragments(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frame_layout,fragment)
            commit()
        }



}