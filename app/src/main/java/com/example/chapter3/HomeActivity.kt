package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    lateinit var editText1 : EditText
    lateinit var editText2 : EditText
    lateinit var btnHitung : Button
    lateinit var hasil : TextView
    lateinit var buttonReset : Button
    lateinit var kondisi : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        editText1 = findViewById(R.id.inputAngka1) as EditText
        editText2 = findViewById(R.id.inputAngka2) as EditText
        btnHitung = findViewById(R.id.buttonHitung) as Button
        hasil = findViewById(R.id.hasil) as TextView
        buttonReset = findViewById(R.id.buttonReset) as Button
        kondisi = findViewById(R.id.kondisi) as TextView



        btnHitung.setOnClickListener{
            var input1 = editText1.text.toString().toInt()
            var input2 = editText2.text.toString().toInt()
            var jumlah = input1 + input2

            hasil.text = jumlah.toString()
            if (jumlah > 100){
                kondisi.text = "Nilai lebih dari 100"
            }else{
                kondisi.text = "Nilai kurang dari 100"
            }

        }
        buttonReset.setOnClickListener{
            resetData()
        }
    }
    fun resetData(){
        editText1.setText("")
        editText2.setText("")
    }
}