package com.example.projektnizadatakrma

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.EntrypageBinding
import com.example.projektnizadatakrma.databinding.NewgamepageBinding



class NewGamePage: AppCompatActivity() {
    lateinit var binding: NewgamepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NewgamepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}