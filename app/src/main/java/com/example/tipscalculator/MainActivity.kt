package com.example.tipscalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

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

           val totalcontatemp = binding.tieconta.text
           val totalpessoastemp = binding.tieconta.text
           if (totalcontatemp?.isEmpty() == true || totalpessoastemp?.isEmpty() == true ){
              Snackbar.make(binding.tieconta, "Preencha todos os campos", Snackbar.LENGTH_LONG)
                  .show()

           } else{

               val totalconta: Float = totalcontatemp.toString().toFloat()
               val totalpessoas:Int = totalpessoastemp.toString().toInt()

               val total = totalconta + (totalconta * percent/100)
               val totalporpessoa = total / totalpessoas

               binding.txtResult.text= "Valor por pessoa: $totalporpessoa"

               }



                // validar campo vazio

     

       }

        //clean button
       binding.btnClean.setOnClickListener { 
           binding.txtResult.text= ""
           binding.tiepessoas.setText("")
           binding.tieconta.setText("")
           binding.rgOne.isChecked = false
           binding.rgTwo.isChecked = false
           binding.rgThree.isChecked = false

           
       }
    }
}