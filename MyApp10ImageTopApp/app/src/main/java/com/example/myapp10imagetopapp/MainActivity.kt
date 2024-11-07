package com.example.myapp10imagetopapp

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp10imagetopapp.databinding.ActivityMainBinding
import java.io.ByteArrayOutputStream

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
        binding.btnSaveImage.setOnClickListener {
            saveImage()
        }

        binding.btnShareImage.setOnClickListener {
            shareImage()
        }
    }

    private fun saveImage() {
        val bitmap = (binding.ivImage.drawable as BitmapDrawable).bitmap
        val savedImageURL = MediaStore.Images.Media.insertImage(
            contentResolver,
            bitmap,
            "My Image",
            "Image of something"
        )
        val savedImageUri = Uri.parse(savedImageURL)
        // Informujte uživatele, že obrázek byl uložen
    }

    private fun shareImage() {
        val bitmap = (binding.ivImage.drawable as BitmapDrawable).bitmap
        val bytes = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, bytes)
        val path = MediaStore.Images.Media.insertImage(contentResolver, bitmap, "My Image", null)
        val uri = Uri.parse(path)
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, uri)
            type = "image/jpeg"
        }
        startActivity(Intent.createChooser(shareIntent, "Share Image"))
    }
}