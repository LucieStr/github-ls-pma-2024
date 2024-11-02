package com.example.myapp07bfragmentsexample1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class DetailFragment : Fragment() {

    private lateinit var textViewName: TextView
    private lateinit var textViewVedName: TextView


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_detail, container, false)
        textViewName = view.findViewById(R.id.textViewName)
        textViewVedName = view.findViewById(R.id.textViewVed_name)


        // Načtení argumentů a aktualizace textových polí
        arguments?.let {
            val name = it.getString("name")
            val vedName = it.getString("vedName")
            updateDetails(name ?: "Unknown", vedName ?: "Unknown")
        }


        return view
    }

    // Metoda pro aktualizaci zobrazení detailů
    fun updateDetails(name: String, vedName: String) {
        textViewName.text = name
        textViewVedName.text = vedName
    }
}