package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mvp.databinding.ActivityMainBinding

//Controller
class MainActivity : AppCompatActivity(),ViewInterface  {//1번 this는 11번줄을 뜻함

    lateinit var binding : ActivityMainBinding

    var presenter = Presenter(this) //1번

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.mainActivity = this
    }
    //값을 받아오자마자 presenter에게 넘겨줌
    fun clickNumber(i: Int){
        presenter.clickNumber(i)
    }

    //presenter에게 값을 받자마자 View를 보여줌
    override fun toastMessage(i: Int) {
        Toast.makeText(this, "$i 번을 클릭했습니다.", Toast.LENGTH_SHORT).show()
    }

    override fun checkPasswordMessage() {
        binding.messageSuccess.visibility = View.VISIBLE
    }
}

