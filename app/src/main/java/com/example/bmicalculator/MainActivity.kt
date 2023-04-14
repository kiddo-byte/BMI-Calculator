package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var weight_txt:EditText
    private lateinit var height_txt:EditText
    private lateinit var show_bmi:TextView
    private lateinit var bmi_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weight_txt = findViewById(R.id.edtweight)
        height_txt = findViewById(R.id.edtheight)
        show_bmi = findViewById(R.id.txtdisplay)
        bmi_button = findViewById(R.id.btnbmi)

        bmi_button.setOnClickListener {

            var weight = weight_txt.text.toString()
            var height = height_txt.text.toString()

            if (weight.isEmpty()){
                Toast.makeText(this,"Please enter weight", Toast.LENGTH_SHORT).show()
            }else if (height.isEmpty()){
                Toast.makeText(this,"Please enter height", Toast.LENGTH_SHORT).show()
            }else{

                Toast.makeText(this,"Calculating BMI...", Toast.LENGTH_SHORT).show()

                var answer = weight.toDouble() / (height.toDouble() * height.toDouble())
                show_bmi.text = answer.toString()

            }
        }
    }
}