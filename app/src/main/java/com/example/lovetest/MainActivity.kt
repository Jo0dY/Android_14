package com.example.lovetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostController =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
//        navController = findNavController(R.id.nav_host_fragment)
    }
}
