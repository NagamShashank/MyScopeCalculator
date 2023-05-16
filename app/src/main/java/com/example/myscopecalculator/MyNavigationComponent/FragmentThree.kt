package com.example.myscopecalculator.MyNavigationComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.FragmentThreeBinding

class FragmentThree : Fragment() {
    private var fragmentThreeBinding : FragmentThreeBinding? = null
    private val binding get() = fragmentThreeBinding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       fragmentThreeBinding =  FragmentThreeBinding.inflate(inflater,container,false)

        binding.Fragment1BackBtn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentThree_to_fragmentOne)
        }

        return binding.root
    }

}