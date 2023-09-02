package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val edText : EditText = findViewById(R.id.ed_text)
        btnStart.setOnClickListener {

            if(edText.text.isEmpty()) {
                Toast.makeText(this, "이름이 없으면 시작할 수 없어", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, edText.text.toString())
                startActivity(intent)
                finish()
            }
        }

    }
}

