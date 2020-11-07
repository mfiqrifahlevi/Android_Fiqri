package com.mirzayogy.praktikumkelas5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAngkaPertama = findViewById<EditText>(R.id.etAngkaPertama)
        val etAngkaKedua = findViewById<EditText>(R.id.etAngkaKedua)
        val btnHitung = findViewById<Button>(R.id.btnHitung)
        val tvHasil = findViewById<TextView>(R.id.tvHasil)

        btnHitung.setOnClickListener {
//            Toast.makeText(this,"Tombol diklik",Toast.LENGTH_SHORT).show()

            val angkaPertama = etAngkaPertama.text.toString().toDouble()
            val angkaKedua = etAngkaKedua.text.toString().toDouble()

            val hasil = angkaPertama + angkaKedua
            tvHasil.text = hasil.toString()
        }

    }
}