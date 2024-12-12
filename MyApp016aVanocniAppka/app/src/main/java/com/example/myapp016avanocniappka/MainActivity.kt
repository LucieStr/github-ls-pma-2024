package com.example.myapp016avanocniappka

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var christmasImage: ImageView
    private lateinit var changeImageButton: Button
    private lateinit var christmasWishEditText: EditText
    private lateinit var senderNameEditText: EditText
    private lateinit var sendWishButton: Button
    private val images = listOf(
        R.drawable.christmas_tree,
        R.drawable.santa_claus,
        R.drawable.gift
    )
    private var currentImageIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        christmasImage = findViewById(R.id.christmasImage)
        changeImageButton = findViewById(R.id.changeImageButton)
        christmasWishEditText = findViewById(R.id.christmasWishEditText)
        senderNameEditText = findViewById(R.id.senderNameEditText)
        sendWishButton = findViewById(R.id.sendWishButton)

        changeImageButton.setOnClickListener {
            currentImageIndex = (currentImageIndex + 1) % images.size
            christmasImage.setImageResource(images[currentImageIndex])
        }

        sendWishButton.setOnClickListener {
            val wish = christmasWishEditText.text.toString()
            val senderName = senderNameEditText.text.toString()
            if (wish.isNotEmpty() && senderName.isNotEmpty()) {
                Snackbar.make(it, "Přání bylo posláno Ježíškovi", Snackbar.LENGTH_LONG).show()
                christmasWishEditText.text.clear()
                senderNameEditText.text.clear()
            } else {
                Toast.makeText(this, "Napište své vánoční přání a jméno odesílatele", Toast.LENGTH_SHORT).show()
            }
        }

    }
}