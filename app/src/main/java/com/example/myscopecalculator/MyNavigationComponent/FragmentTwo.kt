package com.example.myscopecalculator.MyNavigationComponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myscopecalculator.R
import com.example.myscopecalculator.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    private var fragmentTwoBinding : FragmentTwoBinding? = null
    private val Tbinding get() = fragmentTwoBinding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentTwoBinding = FragmentTwoBinding.inflate(inflater,container,false)

        Tbinding.backFragment1Btn.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_fragmentTwo_to_fragmentOne)
        }

        return Tbinding.root
    }

}