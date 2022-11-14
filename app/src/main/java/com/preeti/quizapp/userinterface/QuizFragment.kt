package com.preeti.quizapp.userinterface

import android.os.Bundle
import android.view.ContextMenu
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.preeti.quizapp.R
import com.preeti.quizapp.databinding.FragmentIntroBinding
import com.preeti.quizapp.databinding.FragmentQuizBinding


class QuizFragment : Fragment() {

    private  lateinit var _binding: FragmentQuizBinding
    private val binding get() = _binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentQuizBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnBack.setOnClickListener {
            requireActivity().onBackPressed()
        }
    }
}