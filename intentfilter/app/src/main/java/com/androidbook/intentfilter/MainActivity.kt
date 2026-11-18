package com.androidbook.intentfilter

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etEmail: EditText = findViewById(R.id.etEmail)
        val etTitle: EditText = findViewById(R.id.etTitle)
        val etContent: EditText = findViewById(R.id.etContent)
        val btnSend: Button = findViewById(R.id.btnSend)

        btnSend.setOnClickListener {
            val email = etEmail.text.toString()
            val title = etTitle.text.toString()
            val content = etContent.text.toString()

            // 암시적 인텐트 생성 (데이터 전송 액션)
            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                // 받는 사람은 문자열 배열(Array<String>) 형태로 전달해야 합니다
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                putExtra(Intent.EXTRA_SUBJECT, title)
                putExtra(Intent.EXTRA_TEXT, content)
            }

            // 처리할 수 있는 앱 선택 창 띄우기
            startActivity(Intent.createChooser(intent, "이메일 앱 선택"))
        }
    }
}