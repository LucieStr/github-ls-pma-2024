package com.example.myapp07afragments

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.example.myapp07afragments.databinding.ActivityMainBinding
import com.example.myapp07afragments.ui.theme.MyApp07aFragmentsTheme

class MainActivity : ComponentActivity() {
    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment1.setOnClickListener{
            replaceFragment(Fragment1())
        }

        binding.btnFragment2.setOnClickListener{
            replaceFragment(Fragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment){
        //ziska instanci spravce fragmentu
        val fragmentManager = supportFragmentManager

        //vytvori novou transakci s fragmenty
        val fragmentTransaction = fragmentManager.beginTransaction
        //nahradi fragment v kontejneru novym fragmentem ktery byl predan jako tzv. argument
        fragmentTransaction.replace(R.id.fragment_container_view_tag, fragment)
        //potvrdi transakci a provede vymenu fragmentu
        fragmentTransaction.commit()
    }



}