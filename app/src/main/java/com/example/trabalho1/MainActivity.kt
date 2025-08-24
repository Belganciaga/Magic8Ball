package com.example.trabalho1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Ajuste de padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Declaração das views
        val etNome = findViewById<EditText>(R.id.etNome)
        val tvHeroi = findViewById<TextView>(R.id.tvHeroi)
        val button = findViewById<Button>(R.id.button)

        val respostas = listOf(
            "Sim",
            "Não",
            "Talvez")

        // Listener do botão
        button.setOnClickListener {
            val nome = etNome.text.toString().trim()      // Coleta o nome
            val resposta = respostas[Random.nextInt(respostas.size)]  // Sorteia a resposta
            tvHeroi.text = "$nome, sua resposta é $resposta"
        }
    }
}
