package com.example.myapp01linearlayout

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        /*ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
           } */

       val etName = findViewById<EditText>(R.id.etName) //reference na EditText
       val etLastname = findViewById<EditText>(R.id.etLastname)
       val etPlace = findViewById<EditText>(R.id.etPlace)
       val etAge = findViewById<EditText>(R.id.etAge)
       val tvInformation = findViewById<TextView>(R.id.tvInformation)
       val btnSend = findViewById<Button>(R.id.btnSend)
       val btnDelete = findViewById<Button>(R.id.btnDelete)

        //nastaveni obsluhy pro tlacitka

        btnSend.setOnClickListener{
            val name = etName.text.toString()
            val surname = etLastname.text.toString()
            val place = etPlace.text.toString()
            val age = etAge.text.toString() //muzeme dal prevest na int

            // zobrazeni textu v TextView
            val formattedText = "Jmenuji se $name $surname. Je mi $age let a moje bydliště je $place."
            tvInformation.text = formattedText
        }

        btnDelete.setOnClickListener{
            etName.text.clear()
            etLastname.text.clear()
            etPlace.text.clear()
            etAge.text.clear()

            tvInformation.text = ""
        }
    }
}