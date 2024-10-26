package com.example.myapp06toastsnackbar

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

import com.example.myapp06toastsnackbar.databinding.ActivityMainBinding
import com.example.myapp06toastsnackbar.databinding.CustomToastBinding
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
        fun showToast() {
            // Initialize ViewBinding for the custom toast layout
            val toastBinding = CustomToastBinding.inflate(layoutInflater)

            // Set image and text for the Toast using binding
            toastBinding.toastImage.setImageResource(R.drawable.ic_toast_icon) // Replace with your own image
            toastBinding.toastText.text = "Směr je tímto směrem, protože jinak by realita neodpovídala skutečnosti."

            // Create the custom Toast
            val toast = Toast(applicationContext)
            toast.duration = Toast.LENGTH_LONG

            // Set the custom view for the Toast
            toast.view = toastBinding.root // Deprecated, but still functional below API 30

            // Set the position of the Toast if needed
            toast.setGravity(Gravity.BOTTOM, 0, 100)

            toast.show()
        }
    }

}