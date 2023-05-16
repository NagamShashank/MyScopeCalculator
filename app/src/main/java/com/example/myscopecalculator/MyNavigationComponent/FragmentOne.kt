package com.example.myscopecalculator.MyNavigationComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.FragmentOneBinding


class FragmentOne : Fragment() {
    private var fragmentOneBinding : FragmentOneBinding? = null
    private val binding get() = fragmentOneBinding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentOneBinding = FragmentOneBinding.inflate(inflater,container,false)

        binding.Fragment2Btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentOne_to_fragmentTwo)
        }

        binding.Fragment3Btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentOne_to_fragmentThree)
        }

        return binding.root
    }


}