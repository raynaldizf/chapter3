package com.example.chapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class HitungNilaiMahasiswa : AppCompatActivity() {
    lateinit var inputNama : EditText
    lateinit var inputNim : EditText
    lateinit var inputUas : EditText
    lateinit var inputUts : EditText
    lateinit var inputTugas : EditText
    lateinit var btnHitung : Button
    lateinit var btnReset : Button
    lateinit var outputNama : TextView
    lateinit var outputNim : TextView
    lateinit var outputUas : TextView
    lateinit var outputUts : TextView
    lateinit var outputTugas : TextView
    lateinit var outputTotal : TextView
    lateinit var outputRataRata : TextView
    lateinit var outputNilaiHuruf : TextView
    lateinit var outputStatus : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung_nilai_mahasiswa)

        inputNama = findViewById(R.id.inputNama) as EditText
        inputNim = findViewById(R.id.inputNim) as EditText
        inputUas = findViewById(R.id.inputUas) as EditText
        inputUts = findViewById(R.id.inputUts) as EditText
        inputTugas = findViewById(R.id.inputTugas) as EditText
        btnHitung = findViewById(R.id.btnHitung) as Button
        btnReset = findViewById(R.id.btnReset) as Button
        outputNama = findViewById(R.id.outputNama) as TextView
        outputNim = findViewById(R.id.outputNim) as TextView
        outputUas = findViewById(R.id.outputUas) as TextView
        outputUts = findViewById(R.id.outputUts) as TextView
        outputTugas = findViewById(R.id.outputTugas) as TextView
        outputTotal = findViewById(R.id.outputTotal) as TextView
        outputRataRata = findViewById(R.id.outputRataRata) as TextView
        outputNilaiHuruf = findViewById(R.id.outputNilaiHuruf) as TextView
        outputStatus = findViewById(R.id.outputStatus) as TextView

        btnHitung.setOnClickListener{
            var nama = inputNama.text.toString()
            var nim = inputNim.text.toString().toInt()
            var uas = inputUas.text.toString().toInt()
            var uts = inputUts.text.toString().toInt()
            var tugas = inputTugas.text.toString().toInt()
            var totalNilai = (uas + uts + tugas)
            var rata = totalNilai/3

            if (rata in 0..60){
                outputNama.text="Nama Mahasiswa : $nama"
                outputNim.text="NIM : $nim"
                outputUas.text="UAS : $uas"
                outputUts.text="UTS : $uts"
                outputTugas.text="Tugas : $tugas"
                outputTotal.text="Total : $totalNilai"
                outputRataRata.text="Rata-Rata Nilai : $rata"
                outputNilaiHuruf.text="Nilai Huruf : F"
                outputStatus.text="Status : Tidak Lulus"
            }else if (rata in 61..70){
                outputNama.text="Nama Mahasiswa : $nama"
                outputNim.text="NIM : $nim"
                outputUas.text="UAS : $uas"
                outputUts.text="UTS : $uts"
                outputTugas.text="Tugas : $tugas"
                outputTotal.text="Total : $totalNilai"
                outputRataRata.text="Rata-Rata Nilai : $rata"
                outputNilaiHuruf.text="Nilai Huruf : D"
                outputStatus.text="Status : Tidak Lulus"
            }else if(rata in 71..80){
                outputNama.text="Nama Mahasiswa : $nama"
                outputNim.text="NIM : $nim"
                outputUas.text="UAS : $uas"
                outputUts.text="UTS : $uts"
                outputTugas.text="Tugas : $tugas"
                outputTotal.text="Total : $totalNilai"
                outputRataRata.text="Rata-Rata Nilai : $rata"
                outputNilaiHuruf.text="Nilai Huruf : C"
                outputStatus.text="Status : Lulus"
            }else if(rata in 81..90){
                outputNama.text="Nama Mahasiswa : $nama"
                outputNim.text="NIM : $nim"
                outputUas.text="UAS : $uas"
                outputUts.text="UTS : $uts"
                outputTugas.text="Tugas : $tugas"
                outputTotal.text="Total : $totalNilai"
                outputRataRata.text="Rata-Rata Nilai : $rata"
                outputNilaiHuruf.text="Nilai Huruf : B"
                outputStatus.text="Status : Lulus"
            }else if(rata in 91..100){
                outputNama.text="Nama Mahasiswa : $nama"
                outputNim.text="NIM : $nim"
                outputUas.text="UAS : $uas"
                outputUts.text="UTS : $uts"
                outputTugas.text="Tugas : $tugas"
                outputTotal.text="Total : $totalNilai"
                outputRataRata.text="Rata-Rata Nilai : $rata"
                outputNilaiHuruf.text="Nilai Huruf : A"
                outputStatus.text="Status : Lulus"
            }
        }
        btnReset.setOnClickListener{
            resetData()
        }
    }
    fun resetData(){
        outputNama.setText("")
        outputNim.setText("")
        outputUas.setText("")
        outputUts.setText("")
        outputTugas.setText("")
        outputTotal.setText("")
        outputRataRata.setText("")
        outputNilaiHuruf.setText("")
        outputStatus.setText("")
        inputNama.setText("")
        inputNim.setText("")
        inputUas.setText("")
        inputUts.setText("")
        inputTugas.setText("")
    }
}