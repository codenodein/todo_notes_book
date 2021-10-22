package com.ajapps.tod.note.book.save

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ajapps.tod.note.book.save.ui.main.TodoListFragment

class TodoList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.todo_list_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, TodoListFragment.newInstance())
                .commitNow()
        }
    }
}