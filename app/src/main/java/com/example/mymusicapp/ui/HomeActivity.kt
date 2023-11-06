package com.example.mymusicapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymusicapp.R

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //masang fragment
        val fragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()

        val fragment = fragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
        if (fragment !is HomeFragment){
            fragmentManager
                .beginTransaction()
                .add(R.id.frameContainer,homeFragment,HomeFragment::class.java.simpleName)
                .commit()
        }
    }
}