package com.example.projektnizadatakrma

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projektnizadatakrma.databinding.EntrypageBinding
import com.example.projektnizadatakrma.databinding.LeaderspageBinding



class LeadersPage: AppCompatActivity() {
    lateinit var binding: LeaderspageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LeaderspageBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}