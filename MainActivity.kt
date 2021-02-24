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
                var incOvertime = editTextSalary.text.toString().toDouble()
                var incHour = editTextHour.text.toString().toDouble()

                var stepOne = incHour - 45
                var stepTwo = ((incOvertime / 225) * 1.5) * stepOne

                textView.text = stepTwo.toInt().toString()
            }catch(e: Exception){
                Toast.makeText(this,"Missing or incorrect data entry",Toast.LENGTH_SHORT).show()
            }
        }
    }
}