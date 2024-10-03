package com.example.myapp03objednavka

import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapp03objednavka.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()

        //binding setting
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        title = "Objednávka prstenu"

        //nastaveni tlacitka
        binding.btnObjednavka.setOnClickListener{
            val prstenRbId = binding.rPrsten.checkedRadioButtonId

            //to co se zaskrtne se da do val prsten
            val prsten = findViewById<RadioButton>(prstenRbId)

            val krouzky = binding.chKrouzky.isChecked
            val barva = binding.chBarvaK.isChecked
            val jeden = binding.chJedenK.isChecked

            val objednavkaText = "Souhrn objednávky: " +
                    "${prsten.text}" + " prsten" +
                    (if(krouzky) "; méně kroužků" else "") +
                    (if(barva) "; zelená barva kamenů" else "") +
                    (if(jeden) "; prsten bude mít jen jeden kámen ve vybrané barvě" else "")

            binding.tvObjednavka.text = objednavkaText
        }

        //zmena obrazku v zavislosti na vyberu
        binding.rPrstenZl.setOnClickListener{
            binding.ivPrsten.setImageResource(R.drawable.zlato)
        }
        binding.rPrstenRG.setOnClickListener{
            binding.ivPrsten.setImageResource(R.drawable.rosegold)
        }
        binding.rPrstenSt.setOnClickListener{
            binding.ivPrsten.setImageResource(R.drawable.stribro)
        }
    }
}