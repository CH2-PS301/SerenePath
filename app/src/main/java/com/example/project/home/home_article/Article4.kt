package com.example.project.home.home_article

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.project.R

class Article4 : AppCompatActivity() {

    private lateinit var kembali : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article4)

        button()
    }
    private fun button() {
        kembali = findViewById(R.id.back)
        kembali.setOnClickListener {
            startActivity(Intent(this, SereneArticle::class.java))
        }
    }
}