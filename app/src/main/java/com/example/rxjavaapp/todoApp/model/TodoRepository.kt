package com.example.rxjavaapp.todoApp.model

import android.content.Context
import com.example.rxjavaapp.todoApp.model.local.AppDatabase
import com.example.rxjavaapp.todoApp.model.local.Todo
import com.example.rxjavaapp.todoApp.model.local.TodoDao
import io.reactivex.rxjava3.core.Observable

class TodoRepository(context: Context) {

    private val dao: TodoDao by lazy {
        AppDatabase.getInstance(context).getTodoDao()
    }

    fun upsert(todo: Todo) = dao.upsert(todo)

    fun delete(todo: Todo) = dao.delete(todo)

    fun getAllTodo(): Observable<List<Todo>> = dao.getAllTodos()

}