package com.example.listatelefonica.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listatelefonica.R
import com.example.listatelefonica.databinding.ActivitySelecionarImagemContactoBinding

class SelecionarImagemContactoActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelecionarImagemContactoBinding
    private lateinit var i: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelecionarImagemContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        i = intent

        binding.imagemProfile1.setOnClickListener{ sendId(R.drawable.ceo)}
        binding.imagemProfile2.setOnClickListener{ sendId(R.drawable.doctor)}
        binding.imagemProfile3.setOnClickListener{ sendId(R.drawable.engineer)}
        binding.imagemProfile4.setOnClickListener{ sendId(R.drawable.man)}
        binding.imagemProfile5.setOnClickListener{ sendId(R.drawable.woman1)}
        binding.imagemProfile6.setOnClickListener{ sendId(R.drawable.woman)}

        binding.buttonRemoverImagem.setOnClickListener { sendId(R.drawable.profilepicture)}
    }

    private fun sendId(imagemId: Int) {
        i.putExtra("id", imagemId)
        setResult(1, i)
        finish()
    }
}