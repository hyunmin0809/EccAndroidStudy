package com.example.week11_databinding_ex

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.example.week11_databinding_ex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //1. 바인딩에 대해 알아보자
        /*
        //1번 방식 : findViewById
        val btn = findViewById<Button>(R.id.testBtnId)
        btn.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
        */
        /*
        //2번 방식 : Databinding
        binding.testBtnId.setOnClickListener{
            Toast.makeText(this, "click", Toast.LENGTH_LONG).show()
        }
        */

        //2. val vs var
        /*
        var value = "여기는 value입니다."
        val value2 = "여기는 value2입니다."

        value = "여기는 value가 아닙니다."
        value2 = "여기는 value2가 아닙니다."
        */

        //3. log 사용하기
        Log.e("MainActivity", "오류")
        Log.w("MainActivity", "경고")
        Log.i("MainActivity", "정보")
        Log.d("MainActivity", "디버그")
        Log.v("MainActivity", "상세")


    }
}