package com.example.myapp07bfragmentsexample1

import android.media.Image
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Přidáme ListFragment, pokud ještě neexistuje
        if (savedInstanceState == null) {
            val listFragment = ListFragment()

            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_list, listFragment)
                .commit()


        }
    }



    // Voláno při výběru knihy
    fun onFlowerSelected(nazev: String, vedNazev: String) {
        // Vytvoření nového DetailFragment a nastavení argumentů
        val detailFragment = DetailFragment()


        val bundle = Bundle().apply {
            putString("name", nazev)
            putString("vedName", vedNazev)

        }
        detailFragment.arguments = bundle

        // Nahradíme starý fragment novým a commitneme transakci
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_detail, detailFragment)
            .commit()



    }

}
