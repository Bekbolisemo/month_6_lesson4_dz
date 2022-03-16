package com.example.month_6_lesson4_dz.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {
    private var mCounter = 0
    val counter = MutableLiveData<Int>()
    val arrayList = MutableLiveData<ArrayList<String>>()
    val list = arrayListOf<String>()


    fun add(){
        mCounter++
        counter.value = mCounter
        list.add("+ \n")
        arrayList.value = list
    }

    fun zero(){
        mCounter++
        counter.value = mCounter
        list.add("- \n")
        arrayList.value = list
    }
}