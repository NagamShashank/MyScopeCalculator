package com.example.myscopecalculator.objectVScompanion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding : ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.outputTextClear.setOnClickListener {
            binding.txtOutput.text = null
            binding.txtNumber1.text = null
            binding.txtNumber2.text = null
        }

        binding.mySumBtn.setOnClickListener {
            if(binding.txtNumber1.text.isNotEmpty() && binding.txtNumber2.text.isNotEmpty()){
                //var cal = calculation()
                calculation.number1 = binding.txtNumber1.text.toString().toInt()
                calculation.number2 = binding.txtNumber2.text.toString().toInt()
                val output = calculation.getSum()
                binding.txtOutput.text = output.toString()

            }else{
                Toast.makeText(this,"Please Enter Number in Both Edittext",Toast.LENGTH_SHORT).show()
            }
        }


        binding.myMulBtn.setOnClickListener {
            if(binding.txtNumber1.text.isNotEmpty() && binding.txtNumber2.text.isNotEmpty()){
                var cal1 = calculation()
                var multiply = cal1.getMul(binding.txtNumber1.text.toString().toInt(),binding.txtNumber2.text.toString().toInt())
//                calculation.number1 = binding.txtNumber1.text.toString().toInt()
//                calculation.number2 = binding.txtNumber2.text.toString().toInt()
                val output2 = multiply
                binding.txtOutput.text = output2.toString()

            }else{
                Toast.makeText(this,"Please Enter Number in Both Edittext",Toast.LENGTH_SHORT).show()
            }
        }

    }
}