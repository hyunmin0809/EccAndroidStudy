package com.example.week10_twice_app

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import android.widget.ImageView
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

        val imageViewIds = arrayOf(
            R.id.member1, R.id.member2, R.id.member3,
            R.id.member4, R.id.member5, R.id.member6,
            R.id.member7, R.id.member8, R.id.member9
        )

        // ImageView 배열 생성 및 클릭 리스너 설정
        for (i in imageViewIds.indices) {
            val imageView = findViewById<ImageView>(imageViewIds[i])
            imageView.setOnClickListener {
                val intent = Intent(this, ImageInsideActivity::class.java)
                intent.putExtra("data", (i + 1).toString())
                startActivity(intent)
            }
        }

    }
}