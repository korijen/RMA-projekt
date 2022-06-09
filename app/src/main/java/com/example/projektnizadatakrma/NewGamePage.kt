package com.example.projektnizadatakrma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.NewgamepageBinding



class NewGamePage: Fragment() {
    lateinit var binding: NewgamepageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = NewgamepageBinding.inflate(layoutInflater)
        return binding.root
    }

}