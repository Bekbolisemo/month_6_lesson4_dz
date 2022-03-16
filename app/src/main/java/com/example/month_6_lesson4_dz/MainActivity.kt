package com.example.month_6_lesson4_dz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.month_6_lesson4_dz.adapter.AddAdapter
import com.example.month_6_lesson4_dz.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: AddAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initView()
    }

    private fun initView() {
        adapter = AddAdapter(this)
        binding.viewPager2.adapter = adapter
    }
}