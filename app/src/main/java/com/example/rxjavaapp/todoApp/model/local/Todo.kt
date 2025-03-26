package com.example.rxjavaapp.todoApp.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title : String,
    val isCompleted: Boolean
)
