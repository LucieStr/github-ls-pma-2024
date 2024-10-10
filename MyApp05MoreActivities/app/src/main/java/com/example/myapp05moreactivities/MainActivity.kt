package com.example.myapp05moreactivities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp05moreactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSecond.setOnClickListener {
            val nickname = binding.etNickname.text.toString() // získáme text z edit text pole
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NICK_NAME", nickname)
            startActivity(intent)
        }
    }
}