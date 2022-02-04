package com.example.navegacionbasica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {

    private lateinit var binding: ActivityMain3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var texto = intent.getIntExtra("Tamano",0)
        binding.text.text= "El edit text de la activity anterior tenía una longitud de "+texto +" caracteres "
        if (texto==0){
            var texto = intent.getStringExtra("Cadena")
            binding.text.text="El edit text de la activity anterior contenía:  " + texto
        }


    }
}