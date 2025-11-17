package com.example.trabalho1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var etNome: EditText
    private lateinit var tvHeroi: TextView
    private lateinit var button: Button

    private val respostas = listOf("Sim", "Não", "Talvez")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        etNome = findViewById(R.id.etNome)
        tvHeroi = findViewById(R.id.tvHeroi)
        button = findViewById(R.id.button)

        button.setOnClickListener {
            val nome = etNome.text.toString().trim()

            if (nome.isEmpty()) {
                tvHeroi.text = "Digite um nome!"
                return@setOnClickListener
            }

            val resposta = respostas.random()
            tvHeroi.text = "$nome, sua resposta é: $resposta"
        }
    }
}
