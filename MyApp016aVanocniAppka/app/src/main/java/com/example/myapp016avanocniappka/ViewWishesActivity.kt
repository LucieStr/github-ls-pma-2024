package com.example.myapp016avanocniappka

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.InputStreamReader

class ViewWishesActivity : AppCompatActivity() {


    private lateinit var wishesTextView: TextView
    private lateinit var clearWishesButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_wishes)

        wishesTextView = findViewById(R.id.wishesTextView)
        clearWishesButton = findViewById(R.id.clearWishesButton)

        val wishes = readWishesFromFile()
        wishesTextView.text = wishes

        clearWishesButton.setOnClickListener {
            clearWishes()
            wishesTextView.text = ""
            Toast.makeText(this, "Všechna přání byla vymazána", Toast.LENGTH_SHORT).show()
        }
    }


    private fun readWishesFromFile(): String {
        return try {
            val file = File(filesDir, "prani.txt")
            val fileInputStream = FileInputStream(file)
            val inputStreamReader = InputStreamReader(fileInputStream)
            val content = inputStreamReader.readText()
            inputStreamReader.close()
            fileInputStream.close()
            content
        } catch (e: Exception) {
            e.printStackTrace()
            "Nepodařilo se načíst přání."
        }
    }
    private fun clearWishes() {
        try {
            val file = File(filesDir, "prani.txt")
            val fileOutputStream = FileOutputStream(file)
            fileOutputStream.write("".toByteArray())
            fileOutputStream.close()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}