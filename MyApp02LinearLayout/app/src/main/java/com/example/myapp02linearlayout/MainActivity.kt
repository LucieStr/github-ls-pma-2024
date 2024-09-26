package com.example.myapp02linearlayout

import android.os.Bundle
import android.widget.Button
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
        }*/
        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnYellow = findViewById<Button>(R.id.btnYellow)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnBrown = findViewById<Button>(R.id.btnBrown)
        val btnOrange = findViewById<Button>(R.id.btnOrange)
        val btnPurple = findViewById<Button>(R.id.btnPurple)
        val btnPink = findViewById<Button>(R.id.btnPink)
        val btnZero = findViewById<Button>(R.id.btnZero)
        val btnOne = findViewById<Button>(R.id.btnOne)
        val btnTwo = findViewById<Button>(R.id.btnTwo)
        val btnThree = findViewById<Button>(R.id.btnThree)
        val btnFour = findViewById<Button>(R.id.btnFour)
        val btnFive = findViewById<Button>(R.id.btnFive)
        val btnSix = findViewById<Button>(R.id.btnSix)
        val btnSeven = findViewById<Button>(R.id.btnSeven)
        val btnEight = findViewById<Button>(R.id.btnEight)
        val btnNine = findViewById<Button>(R.id.btnNine)
        val btnTen = findViewById<Button>(R.id.btnTen)
        val btnTwenty = findViewById<Button>(R.id.btnTwenty)
        val btnThirty = findViewById<Button>(R.id.btnThirty)
        val btnFourty = findViewById<Button>(R.id.btnFourty)
        val btnFifty = findViewById<Button>(R.id.btnFifty)
        val btnSixty = findViewById<Button>(R.id.btnSixty)
        val btnSeventy = findViewById<Button>(R.id.btnSeventy)
        val btnEighty = findViewById<Button>(R.id.btnEighty)
        val btnNinety = findViewById<Button>(R.id.btnNinety)
        val btnHundred = findViewById<Button>(R.id.btnHundred)
        val btnThousand = findViewById<Button>(R.id.btnThousand)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)

        btnRed.setOnClickListener{
            tvAnswer.text = "Red"
        }
        btnYellow.setOnClickListener{
            tvAnswer.text = "Yellow"
        }
        btnBlue.setOnClickListener{
            tvAnswer.text = "Blue"
        }
        btnPurple.setOnClickListener{
            tvAnswer.text = "Purple"
        }
        btnGreen.setOnClickListener{
            tvAnswer.text = "Green"
        }
        btnBrown.setOnClickListener{
            tvAnswer.text = "Brown"
        }
        btnOrange.setOnClickListener{
            tvAnswer.text = "Orange"
        }
        btnPink.setOnClickListener{
            tvAnswer.text = "Pink"
        }
        btnZero.setOnClickListener{
            tvAnswer.text = "Zero"
        }
        btnOne.setOnClickListener{
            tvAnswer.text = "One"
        }
    }
}