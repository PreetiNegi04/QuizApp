package com.preeti.quizapp.userinterface

import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.preeti.quizapp.R
import com.preeti.quizapp.databinding.FragmentIntroBinding


class IntroFragment : Fragment() {

    private  lateinit var _binding: FragmentIntroBinding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        _binding =FragmentIntroBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btncontinue.setOnClickListener{
            val uname = binding.editUserName.text.toString()
            val dir = IntroFragmentDirections.actionIntroFragmentToHomeFragment(uname)
            findNavController().navigate(dir)
        }
    }
}