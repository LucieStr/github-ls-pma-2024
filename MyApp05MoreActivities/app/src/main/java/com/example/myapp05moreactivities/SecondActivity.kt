package com.example.myapp05moreactivities

import android.os.Bundle
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
        binding.twInfo.text = "Data z první aktivity. Jméno: $nickname"

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
