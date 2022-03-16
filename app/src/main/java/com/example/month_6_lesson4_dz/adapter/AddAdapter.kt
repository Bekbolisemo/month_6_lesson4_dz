package com.example.month_6_lesson4_dz.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.month_6_lesson4_dz.ui.FirstFragment
import com.example.month_6_lesson4_dz.ui.SecondFragment
import com.example.month_6_lesson4_dz.ui.ThirdFragment

class AddAdapter(fragment:FragmentActivity):FragmentStateAdapter(fragment) {
    override fun getItemCount() = 3


    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> {
                SecondFragment()
            }
            1->{
                ThirdFragment()
            }
            2 ->{
               FirstFragment()
            }else->{
                SecondFragment()
            }
            }
        }
    }
