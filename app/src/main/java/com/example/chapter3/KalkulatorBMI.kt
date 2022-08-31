package com.example.chapter3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class KalkulatorBMI : AppCompatActivity() {
    lateinit var inputUmur : EditText
    lateinit var inputTinggiBadan : EditText
    lateinit var inputBeratBadan : EditText
    lateinit var btnHitung : Button
    lateinit var btnReset : Button
    lateinit var outputUmur : TextView
    lateinit var outputTinggi : TextView
    lateinit var outputBeratBadan : TextView
    lateinit var outputHasilBmi : TextView
    lateinit var outputKategori : TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator_bmi)

        inputUmur = findViewById(R.id.inputUmur) as EditText
        inputTinggiBadan = findViewById(R.id.inputTinggiBadan) as EditText
        inputBeratBadan = findViewById(R.id.inputBeratBadan) as EditText
        btnHitung = findViewById(R.id.btnHitung) as Button
        btnReset = findViewById(R.id.btnReset) as Button
        outputUmur = findViewById(R.id.outputUmur) as TextView
        outputTinggi = findViewById(R.id.outputTinggi) as TextView
        outputBeratBadan = findViewById(R.id.outputBeratBadan) as TextView
        outputHasilBmi = findViewById(R.id.outputHasilBmi) as TextView
        outputKategori = findViewById(R.id.outputKategori) as TextView

        btnHitung.setOnClickListener{
            var inUmur = inputUmur.text.toString().toDouble()
            var inTinggi = inputTinggiBadan.text.toString().toDouble()
            var inBerat = inputBeratBadan.text.toString().toDouble()
            var jumlah = inBerat/((inTinggi*inTinggi)*0.01)*100

            if (jumlah < 16.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Terlalu Kurus"
            }else if (jumlah in 16.0..17.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Cukup Kurus"
            }else if (jumlah in 17.0..18.5){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Sedikit Kurus"
            }else if (jumlah in 18.5..25.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Normal"
            }else if (jumlah in 25.0..30.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Gemuk"
            }else if (jumlah in 30.0..35.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Obesitas Kelas I"
            }else if (jumlah in 35.0..40.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : Obesitas Kelas II"
            }else if (jumlah > 40.0){
                outputUmur.text = "Umur anda : $inUmur tahun"
                outputTinggi.text ="Tinggi : $inTinggi cm"
                outputBeratBadan.text= "Berat Badan : $inBerat kg"
                outputHasilBmi.text = "BMI anda : $jumlah"
                outputKategori.text = "Kategori : TObesitas Kelas III"
            }
        }
        btnReset.setOnClickListener{
            resetData()
        }

    }
    fun resetData(){
        inputUmur.setText("")
        inputTinggiBadan.setText("")
        inputBeratBadan.setText("")
        outputUmur.setText("")
        outputTinggi.setText("")
        outputBeratBadan.setText("")
        outputHasilBmi.setText("")
        outputKategori.setText("")
    }
}