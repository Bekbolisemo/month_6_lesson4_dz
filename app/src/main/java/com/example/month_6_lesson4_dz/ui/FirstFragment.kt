package com.example.month_6_lesson4_dz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.month_6_lesson4_dz.viewmodel.SharedViewModel
import com.example.month_6_lesson4_dz.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
private lateinit var binding: FragmentFirstBinding
private lateinit var model: SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.counter.observe(requireActivity()){
            binding.tvNumber.text = it.toString()
        }
    }
}