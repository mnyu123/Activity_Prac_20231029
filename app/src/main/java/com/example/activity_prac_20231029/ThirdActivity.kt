package com.example.activity_prac_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.activity_prac_20231029.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_third)

//        3번 화면이 "열린"(보인) 순간 1번 화면에서 보내준 String을 받아서 txtMsg에 반영
//        메시지 태그 붙어있는 메시지를 get 하셈
        val receiveMsg = intent.getStringExtra("메시지")


//       1번 화면에서준 "숫자" 태그의 내용을 받음
//        string처럼 보내면 "기본값" 이 없기 때문에 에러가남
//        왜?  int는 자바의 기본형 변수라서 , "첨부가 안될때의" 기본값이 설정 되어야함.
        val receiveNum = intent.getIntExtra("숫자", 0)

        //        get한 메시지를 txtMsg에 .text형태로 대입해서 넣음
        binding.txtMsg.text = "전달 받은 내용 : ${receiveMsg} \n전달 받은 숫자 : ${receiveNum}"

        Toast.makeText(this, "받은 내용: ${receiveMsg}\n받은 숫자: ${receiveNum}", Toast.LENGTH_SHORT).show()


    }
}