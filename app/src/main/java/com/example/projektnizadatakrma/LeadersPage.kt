package com.example.projektnizadatakrma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projektnizadatakrma.databinding.LeaderspageBinding



class LeadersPage: Fragment() {
    lateinit var binding: LeaderspageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = LeaderspageBinding.inflate(layoutInflater)
        return binding.root
    }

    private fun setupRecyclerView() {
        binding.rvLeaderbord.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )
    }
    override fun onResume() {
        super.onResume()
        updateData()
    }

    private fun updateData() {
     //   adapter.setLeaderbord(getAllLeaders())
    }


}