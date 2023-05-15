package com.example.myscopecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myscopecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textClear.setOnClickListener {
            binding.txtOutput.text = null
        }

        binding.SumBtn.setOnClickListener {
            if (binding.txtNum1.text.isNotEmpty() && binding.txtNum2.text.isNotEmpty()) {
                var numbers = Values().apply {
                    num1 = binding.txtNum1.text.toString().toInt()
                    num2 = binding.txtNum2.text.toString().toInt()
                    val sum = num1 + num2
                    binding.txtOutput.text = "$sum"
                }
            } else {
                Toast.makeText(this, "Please Number in Both Edittext", Toast.LENGTH_SHORT).show()
            }

        }

        binding.SubBtn.setOnClickListener {
            if (binding.txtNum1.text.isNotEmpty() && binding.txtNum2.text.isNotEmpty()) {
                var numbers = Values().also {
                    it.num1 = binding.txtNum1.text.toString().toInt()
                    it.num2 = binding.txtNum2.text.toString().toInt()
                    val sub = it.num1 - it.num2
                    binding.txtOutput.text = "$sub"
                }
            } else {
                Toast.makeText(this, "Please Number in Both Edittext", Toast.LENGTH_SHORT).show()
            }

        }

        binding.DivBtn.setOnClickListener {
            if (binding.txtNum1.text.isNotEmpty() && binding.txtNum2.text.isNotEmpty()) {
                val numbers = Values().run {
                    num1 = binding.txtNum1.text.toString().toInt()
                    num2 = binding.txtNum2.text.toString().toInt()
                    num1 / num2

                }
                binding.txtOutput.text = "$numbers"
            } else {
                Toast.makeText(this, "Please Number in Both Edittext", Toast.LENGTH_SHORT).show()
            }

        }

        binding.MulBtn.setOnClickListener {
            if (binding.txtNum1.text.isNotEmpty() && binding.txtNum2.text.isNotEmpty()) {
//                val numbers = Values().let {
//                    it.num1 = binding.txtNum1.text.toString().toInt()
//                    it.num2 = binding.txtNum2.text.toString().toInt()
//                    it.num1 * it.num2
//                }
                val numbers = Values()
                    with(numbers) {
                    num1 = binding.txtNum1.text.toString().toInt()
                    num2 = binding.txtNum2.text.toString().toInt()
                    num1 * num2
                }
                binding.txtOutput.text = "$numbers"
            } else {
                Toast.makeText(this, "Please Number in Both Edittext", Toast.LENGTH_SHORT).show()
            }

        }



    }

    class Values{
        var num1  : Int = 0
        var num2  : Int = 0
    }
}