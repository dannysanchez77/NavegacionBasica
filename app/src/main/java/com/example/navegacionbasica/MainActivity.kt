package com.example.navegacionbasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navegacionbasica.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Imagen",R.mipmap.spidey)
            startActivity(intent)
        }
        binding.boton2.setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("Tamano", binding.editText.text.length)
            startActivity(intent)
        }
        binding.boton3.setOnClickListener {
            if (Random.nextBoolean()){
                val intent = Intent(this, MainActivity3::class.java)
                intent.putExtra("Cadena", binding.editText.text.toString())
                startActivity(intent)
            }
            else {
                val intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("Imagen", R.mipmap.cerdo)
                startActivity(intent)
            }
        }
    }
}