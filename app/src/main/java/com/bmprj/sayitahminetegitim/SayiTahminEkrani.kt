package com.bmprj.sayitahminetegitim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bmprj.sayitahminetegitim.databinding.ActivitySayiTahminEkraniBinding


class SayiTahminEkrani : AppCompatActivity() {


    val rnd = (0..100).random()
    var kalanHak=5

    private lateinit var binding:ActivitySayiTahminEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_sayi_tahmin_ekrani)
        binding.tahminNesnesi=this
        println(rnd)

    }

    fun TahminBtnClick(tahmin:String){


        if(kalanHak>1){
            if(tahmin.toInt()==rnd){
                val intent = Intent(this@SayiTahminEkrani, SonucEkrani::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)

            }else if(tahmin.toInt()>rnd){
                kalanHak-=1
                binding.kalanHak.text="Kalan Hak: $kalanHak"
                binding.artirAzalt.text="Azalt"
            }else if(tahmin.toInt()<rnd){
                kalanHak-=1
                binding.kalanHak.text="Kalan Hak: $kalanHak"
                binding.artirAzalt.text="Artır"

            }
        }else if(kalanHak==1){
            if(tahmin.toInt()==rnd){
                val intent = Intent(this@SayiTahminEkrani, SonucEkrani::class.java)
                intent.putExtra("sonuc",true)
                finish()
                startActivity(intent)

            }else{
                kalanHak-=1
                binding.kalanHak.text="Kalan Hak: $kalanHak"
                val intent = Intent(this@SayiTahminEkrani, SonucEkrani::class.java)
                intent.putExtra("sonuc",false)
                finish()
                startActivity(intent)
            }
        }
    }
}