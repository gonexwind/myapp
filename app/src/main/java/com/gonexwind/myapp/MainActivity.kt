package com.gonexwind.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.gonexwind.myapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // setup navHost
        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHostFragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController
    }
}