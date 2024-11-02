package com.example.myapp07bfragmentsexample1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView

/*
class ListFragment : Fragment() {
    //private lateinit var ivImage: ImageView
    private lateinit var listView: ListView
    private val flowers = listOf(
        "Kokoška pastuší tobola" to "Capsella bursa-pastoris",
        "Penízek rolní" to "Thlaspi arvense" ,
        "Vesnovka obecná" to "Cardaria draba"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        listView = view.findViewById(R.id.listViewFlowers)
       // ivImage = view.findViewById(R.id.ivImage)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            flowers.map { it.first }
        )
        listView.adapter = adapter

        // Při kliknutí na položku zavoláme metodu aktivity
        listView.setOnItemClickListener { _, _,position, _ ->
           */
/* when (position) {
                0 -> ivImage.setImageResource(R.drawable.kokoskapastusitobolka)
                1 -> ivImage.setImageResource(R.drawable.penizekrolni)
                2 -> ivImage.setImageResource(R.drawable.vesnovkaobecna)
            }*//*

            val selectedFlower = flowers[position]
            (activity as? MainActivity)?.onFlowerSelected(selectedFlower.first, selectedFlower.second)


        }

        return view
    }
}*/
class ListFragment : Fragment() {
    private lateinit var listView: ListView
    private lateinit var ivImage: ImageView
    private val flowers = listOf(
        "Kokoška pastuší tobola" to "Capsella bursa-pastoris",
        "Penízek rolní" to "Thlaspi arvense",
        "Vesnovka obecná" to "Cardaria draba"
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        listView = view.findViewById(R.id.listViewFlowers)
        ivImage = view.findViewById(R.id.imageView)

        val adapter = ArrayAdapter(
            requireContext(),
            android.R.layout.simple_list_item_1,
            flowers.map { it.first }
        )
        listView.adapter = adapter

        listView.setOnItemClickListener { _, _, position, _ ->
            when (position) {
                0 -> ivImage.setImageResource(R.drawable.kokoskapastusitobolka)
                1 -> ivImage.setImageResource(R.drawable.penizekrolni)
                2 -> ivImage.setImageResource(R.drawable.vesnovkaobecna)
            }
            val selectedFlower = flowers[position]
            (activity as? MainActivity)?.onFlowerSelected(selectedFlower.first, selectedFlower.second)
        }

        return view
    }
}
