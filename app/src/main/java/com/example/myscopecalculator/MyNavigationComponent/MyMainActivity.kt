package com.example.myscopecalculator.MyNavigationComponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.ActivityMyMainBinding

class MyMainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMyMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupActionBarWithNavController(findNavController(R.id.fragmentView))

    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.fragmentView)
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

}