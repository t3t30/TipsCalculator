package com.example.tipscalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnClean.setOnClickListener {


        }
        var percent: Int =0

        binding.rgOne.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) percent = 10
        }

        binding.rgTwo.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked) percent = 15
        }

        binding.rgThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) percent = 20
        }



       binding.btnCalculate.setOnClickListener{
           val totalconta: Float = binding.tieconta.text.toString().toFloat()
           val totalpessoas:Int = binding.tiepessoas.text.toString().toInt()

           val total = totalconta + (totalconta * percent/100)
           val totalporpessoa = total / totalpessoas

                //biding every


       }

    }
}