package com.example.btsapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
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

        // 1. 화면이 클릭되었다는 것을 화면이 알아야함.
        val image1 = findViewById<ImageView>(R.id.image_1)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts1Activity::class.java)
            startActivity(intent)
        }
        /*

        val image2 = findViewById<ImageView>(R.id.image_2)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts2Activity::class.java)
            startActivity(intent)
        }

        val image3 = findViewById<ImageView>(R.id.image_3)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts3Activity::class.java)
            startActivity(intent)
        }

        val image4 = findViewById<ImageView>(R.id.image_4)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts4Activity::class.java)
            startActivity(intent)
        }

        val image5 = findViewById<ImageView>(R.id.image_5)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts5Activity::class.java)
            startActivity(intent)
        }

        val image6 = findViewById<ImageView>(R.id.image_6)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts6Activity::class.java)
            startActivity(intent)
        }

        val image7 = findViewById<ImageView>(R.id.image_7)
        image1.setOnClickListener{
            //image1이 클릭되면 어떤 행동을 할지 설정할 수 있다.
            val intent = Intent(this, bts7Activity::class.java)
            startActivity(intent)
        }

         */

    }
}