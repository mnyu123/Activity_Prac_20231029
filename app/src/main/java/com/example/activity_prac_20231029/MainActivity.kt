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
            var myIntent = Intent(this, SecondActivity::class.java)

//            2번 startActivity로 이동
            startActivity(myIntent)

            Toast.makeText(this, "2번 화면으로 이동", Toast.LENGTH_SHORT).show()
        }

        binding.thridBtn.setOnClickListener {
//            3번 화면으로 이동하는 내용
//            문구 전달은 아직
            val myIntent = Intent(this, ThirdActivity::class.java)
//            이동(start) 하기 전에 데이터를 myIntent에 첨부
//            edtText1에 썼던 내용을 변수에 저장하고
            val inputMsg = binding.edtText1.text.toString()
//            그 변수를 첨부할것임.
//            저 메시지는 inputMsg의 값에 있는 태그 , 딱지같은 거임
            myIntent.putExtra("메시지", inputMsg)
//            정상적으로 첨부는 되었으나 3번째 화면에서도 따로 보여주게 구현해야함.

//            숫자를 inputNum에 대입
            val inputNum = binding.edtText2.text.toString().toInt()

            myIntent.putExtra("숫자",inputNum)

            startActivity(myIntent)
        }
    }
}