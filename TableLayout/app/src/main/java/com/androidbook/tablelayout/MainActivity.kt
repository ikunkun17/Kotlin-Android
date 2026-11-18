package com.androidbook.tablelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onResultClick(view: View) {
        val editTurtle = findViewById<EditText>(R.id.editTurtle)
        val editFish = findViewById<EditText>(R.id.editFish)

        val turtleCount = editTurtle.text.toString()
        val fishCount = editFish.text.toString()

        if (turtleCount == "2" && fishCount == "5") {
            Toast.makeText(applicationContext, "맞았습니다", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(applicationContext, "틀렸습니다", Toast.LENGTH_SHORT).show()
        }
    }
}