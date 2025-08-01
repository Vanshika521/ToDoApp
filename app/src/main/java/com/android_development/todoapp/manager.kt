package com.android_development.todoapp

import java.time.Instant
import java.util.Date

object manager {

    private val todoList = mutableListOf<Tasks>()

    fun all():List<Tasks>{
        return todoList
    }

    fun add(title:String){
        todoList.add(Tasks(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun dlt(id : Int){
        todoList.removeIf { it.id == id  }
    }

}