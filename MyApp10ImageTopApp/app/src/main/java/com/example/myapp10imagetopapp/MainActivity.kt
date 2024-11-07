package com.example.myapp10imagetopapp

import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp10imagetopapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // inicializace pro viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) {
            uri: Uri? -> binding.ivImage.setImageURI(uri) //definuje, co se ma provest po dokonceni akce
        }

        //co ziskame po kliknuti na tlacitko 
        binding.btnTakeImage.setOnClickListener{
            getContent.launch("image/*")

        }
    }
}