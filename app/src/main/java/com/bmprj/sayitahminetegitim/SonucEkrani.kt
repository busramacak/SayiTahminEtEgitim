package com.bmprj.sayitahminetegitim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.bmprj.sayitahminetegitim.databinding.ActivitySonucEkraniBinding

class SonucEkrani : AppCompatActivity() {
    private lateinit var binding:ActivitySonucEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_sonuc_ekrani)
        binding.sonucNesnesi=this





//        val sonuc:String= Intent().getStringExtra("sonuc").toString()
//
//
//        if(sonuc=="d"){
//            binding.imageView.setImageResource(R.drawable.smile)
//            binding.kazandinizTxt.text="KAZANDINIZ"
//        }else if(sonuc=="y"){
//            binding.imageView.setImageResource(R.drawable.agla)
//            binding.kazandinizTxt.text="KAYBETTİNİZ"
//        }

    }

    fun tekrarBtnClick(view: View) {
        startActivity(Intent(this@SonucEkrani,SayiTahminEkrani::class.java))
    }
}


