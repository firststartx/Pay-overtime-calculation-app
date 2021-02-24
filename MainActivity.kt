package com.example.mesaihesaplama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener {
            try{
                var gelenmaas = editTextSalary.text.toString().toDouble()
                var gelenSaat = editTextHour.text.toString().toDouble()

                var adimBir = gelenSaat - 45
                var adimIki = ((gelenmaas / 225) * 1.5) * adimBir

                textView.text = adimIki.toInt().toString()
            }catch(e: Exception){
                Toast.makeText(this,"Missing or incorrect data entry",Toast.LENGTH_SHORT).show()
            }
        }
    }
}