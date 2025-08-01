package com.android_development.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class viewModel : ViewModel(){

    private var _todoList = MutableLiveData<List<Tasks>>()
    val todoList : LiveData<List<Tasks>> = todoList

    fun all(){
        _todoList.value = manager.all().reversed()
    }

    fun add(title : String){
        manager.add(title)
        all()
    }

    fun dlt(id : Int){
        manager.dlt(id)
    }
}