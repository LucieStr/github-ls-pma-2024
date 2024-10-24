package com.example.myapp06toastsnackbar

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp06toastsnackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

            // Inicializace ViewBinding
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)

            // Nastavení akce pro tlačítko Zobrazit TOAST
            binding.btnShowToast.setOnClickListener {

                val toast = Toast.makeText(this, "Nazdar - mám hlad", Toast.LENGTH_SHORT)

                toast.show()
            }

            // Nastavení akce pro tlačítko Zobrazit SNACKBAR

            binding.btnShowSnackbar.setOnClickListener {

                Snackbar.make(binding.root, "Já jsem SNACKBAR",Snackbar.LENGTH_SHORT)

                    .setDuration(7000)
                    .setBackgroundTint(Color.parseColor("#FF35AA"))
                    .setTextColor(Color.BLACK)
                    .setActionTextColor(Color.WHITE)

                    .setAction("Zavřít") {
                        Toast.makeText(this, "Zavírám SNACKBAR", Toast.LENGTH_SHORT).show()
                    }

                    .show()
            }
    }
}