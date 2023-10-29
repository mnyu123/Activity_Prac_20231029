package com.example.activity_prac_20231029

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.activity_prac_20231029.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.transBtn.setOnClickListener {
//            버튼이 눌리면 2번 화면으로 이동
//            화면 이동 -> Intent 클래스

//            1번 어디서 출발해서 어디로 도착할지 정보 명시
            var myIntent = Intent(this,SecondActivity::class.java)

//            2번 startActivity로 이동
            startActivity(myIntent)

            Toast.makeText(this, "2번 화면으로 이동", Toast.LENGTH_SHORT).show()
        }


    }
}