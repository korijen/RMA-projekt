package com.example.projektnizadatakrma

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.CreatequizpageBinding
import com.example.projektnizadatakrma.databinding.EntrypageBinding
import kotlinx.android.synthetic.main.createquizpage.*


class CreateQuizPage: AppCompatActivity() {
    lateinit var binding: CreatequizpageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CreatequizpageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnAddQuestion = findViewById<Button>(R.id.btnAddQuestion)
        btnAddQuestion.setOnClickListener {
            val etTitle = findViewById<EditText>(R.id.etTitle)
            val etTheme = findViewById<EditText>(R.id.etTheme)
            val etDescription = findViewById<EditText>(R.id.etDescription)
            if (etTitle.text.isNotEmpty() && etDescription.text.isNotEmpty() && etTheme.text.isNotEmpty()) {
                Toast.makeText(this, "Added question", Toast.LENGTH_SHORT).show()
            }

        }
    }
}