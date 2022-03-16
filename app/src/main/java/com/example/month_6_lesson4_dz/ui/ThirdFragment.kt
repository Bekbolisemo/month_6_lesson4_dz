package com.example.month_6_lesson4_dz.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.month_6_lesson4_dz.viewmodel.SharedViewModel
import com.example.month_6_lesson4_dz.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {
private lateinit var binding: FragmentThirdBinding
private lateinit var model : SharedViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater)
        model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        model.arrayList.observe(requireActivity()){
            it.forEach{values->
                binding.tvNumber.append(values)
            }
        }
    }


}