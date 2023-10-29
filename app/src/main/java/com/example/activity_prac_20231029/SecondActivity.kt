package com.example.activity_prac_20231029

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.activity_prac_20231029.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding : ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_second)

        binding.backBtn.setOnClickListener {
//            현재 화면을 종료하는 방식 : 밑에 있었던 1번 화면이 보임.
            finish()

            Toast.makeText(this, "1번 화면으로 이동", Toast.LENGTH_SHORT).show()
        }
    }
}