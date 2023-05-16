package com.example.myscopecalculator.MyFragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.ActivityMain4Binding
import com.example.myscopecalculator.databinding.Fragment1Binding

class MainActivity4 : AppCompatActivity() {
    private lateinit var binding : ActivityMain4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fragment1Btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.FragmentView, fragment_1()).commit()
        }

//        binding.fragment2Btn.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.FragmentView, fragment_2()).commit()
//        }
    }
}