package com.example.myapp05moreactivities

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

import com.example.myapp05moreactivities.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()

        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Načtení dat z intentu
        val nickname = intent.getStringExtra("NICK_NAME")
        val number = intent.getStringExtra("NUMBER")
        binding.tvInfo.text = "Jméno tvého avatara je:\n $nickname$number"

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}
