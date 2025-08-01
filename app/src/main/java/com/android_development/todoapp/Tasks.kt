package com.android_development.todoapp

import java.time.Instant
import java.util.Date

data class Tasks(
    var id:Int,
    var title:String,
    var time:Date
)

fun ftodo():List<Tasks>{
    return listOf<Tasks>(
        Tasks(1,"First",Date.from(Instant.now())),
        Tasks(2,"Second",Date.from(Instant.now())),
        Tasks(3,"Third",Date.from(Instant.now())),
        Tasks(4,"Four",Date.from(Instant.now()))

    );

}
