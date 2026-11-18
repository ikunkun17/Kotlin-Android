package com.androidbook.bookmarket

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BooksActivity : AppCompatActivity() {

    lateinit var book10bj : ImageView
    lateinit var book20bj : ImageView
    lateinit var book30bj : ImageView
    lateinit var book40bj : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_books)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.books)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        book10bj = findViewById(R.id.book1)
        book20bj = findViewById(R.id.book2)
        book30bj = findViewById(R.id.book3)
        book40bj = findViewById(R.id.book4)

        book10bj = findViewById(R.id.book1)
        book20bj = findViewById(R.id.book2)
        book30bj = findViewById(R.id.book3)
        book40bj = findViewById(R.id.book4)

        book10bj.setOnClickListener {
            Toast.makeText(getApplicationContext(),"쉽게 배우는 알고리즘", Toast.LENGTH_LONG).show()
        }
        book20bj.setOnClickListener {
            Toast.makeText(getApplicationContext(),"난생 처음 MysQl", Toast.LENGTH_LONG).show()
        }
        book30bj.setOnClickListener {
            Toast.makeText(getApplicationContext(),"쉽게 배우는 PHP 웹 프로그래밍", Toast.LENGTH_LONG).show()
        }
        book40bj.setOnClickListener {
            Toast.makeText(getApplicationContext(),"미라클 HTML5 + CSS3 + 자바스크립트", Toast.LENGTH_LONG).show()
        }

    }
}