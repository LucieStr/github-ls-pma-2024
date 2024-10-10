package com.example.myapp05moreactivities

import android.content.Intent
import android.os.Bundle
import android.text.InputFilter

import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp05moreactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Načtení dat z intentu
        val nickname = intent.getStringExtra("NICK_NAME")
        binding.tvInfo.text = "Data z první aktivity. Jméno: $nickname"



        binding.btnThird.setOnClickListener {
            val number = binding.etNumber.text.toString() // získáme text z edit text pole
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NUMBER", number)
            intent.putExtra("NICK_NAME", nickname)
            startActivity(intent)

        }


        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
