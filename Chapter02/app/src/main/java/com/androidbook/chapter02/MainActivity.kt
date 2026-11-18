package com.androidbook.chapter02

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number = mutableListOf(1, 2, 3).also {
            println("리스트의 크기: ${it.size}")
            it.add(4)
        }

        println(number)

        Log.d("코틀린 : also 스코프 함수", "결과 리스트: $number")


    }
}