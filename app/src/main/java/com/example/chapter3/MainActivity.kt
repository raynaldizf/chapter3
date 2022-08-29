package com.example.chapter3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnKlik3 : Button
    lateinit var textHasil2 : TextView
    lateinit var editNama : EditText
    lateinit var buttonSimpan : Button
    lateinit var textNama : TextView
    lateinit var btnHome : Button
    lateinit var btnBMI : Button
    lateinit var btnHitungNilai : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnKlik = findViewById(R.id.buttonMain) as Button
        var textHasil = findViewById(R.id.helloWorldMain) as TextView
        var btnKlik2 = findViewById(R.id.buttonMain2) as Button
        textHasil2 = findViewById(R.id.txthasil2)
        btnKlik3 = findViewById(R.id.buttonMain3)

        btnKlik.setOnClickListener{
            textHasil.text = "Halo, Terimakasih sudah klik button 1"
        }

        btnKlik2.setOnClickListener{
            textHasil.text="Ini button klik 2"
        }
        setOnclick()
        saveNama()
        intentkeHome()
        intentKeBMI()
        intentKeHitungNilaiMahasiswa()

    }
    fun setOnclick(){
        textHasil2 = findViewById(R.id.txthasil2)
        btnKlik3.setOnClickListener{
            textHasil2.text="Ini adalah button klik 3"
        }
    }

    fun saveNama(){
        editNama =findViewById(R.id.inputNama)
        buttonSimpan = findViewById(R.id.btnSimpan)
        textNama = findViewById(R.id.textNama)

        buttonSimpan.setOnClickListener{
            var nama = editNama.text.toString()
            textNama.text = nama
        }
    }
    fun intentkeHome(){
        btnHome = findViewById(R.id.pindahKeHome)
//        Intent : perpindahan dari 1 activity ke activity lainnya
        btnHome.setOnClickListener{
            var pindah = Intent(this,HomeActivity::class.java)
            startActivity(pindah)
        }
    }
    fun intentKeBMI(){
        btnBMI = findViewById(R.id.pindahKeBMI)
//        Intent : perpindahan dari 1 activity ke activity lainnya
        btnBMI.setOnClickListener{
            var pindah = Intent(this,KalkulatorBMI::class.java)
            startActivity(pindah)
        }
    }
    fun intentKeHitungNilaiMahasiswa(){
        btnHitungNilai = findViewById(R.id.pindahkeHitungMahasiswa)
//        Intent : perpindahan dari 1 activity ke activity lainnya
        btnHitungNilai.setOnClickListener{
            var pindah = Intent(this,HitungNilaiMahasiswa::class.java)
            startActivity(pindah)
        }
    }
}