package com.example.week10_twice_app

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImageInsideActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_image_inside)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val imageView = findViewById<ImageView>(R.id.imgView)
        val getData = intent.getStringExtra("data")

        getData?.let {
            // 동적으로 drawable 리소스 ID를 가져오기
            val resourceId = resources.getIdentifier("member_$it", "drawable", packageName)
            if (resourceId != 0) { // 리소스가 존재하는 경우에만 설정
                imageView.setImageResource(resourceId)
            }
        }
    }
}