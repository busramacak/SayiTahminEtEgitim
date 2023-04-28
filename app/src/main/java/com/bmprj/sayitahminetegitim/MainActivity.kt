package com.bmprj.sayitahminetegitim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bmprj.sayitahminetegitim.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.mainNesnesi=this
    }


    fun BaslaBtnClick(){
        startActivity(Intent(this@MainActivity,SayiTahminEkrani::class.java))
    }
}