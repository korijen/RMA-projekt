package com.example.projektnizadatakrma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.EntrypageBinding



class EntryPage: Fragment() {
    lateinit var binding: EntrypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = EntrypageBinding.inflate(layoutInflater)
        return binding.root
    }

}