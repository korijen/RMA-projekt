package com.example.projektnizadatakrma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.ProfilepageBinding


class ProfilePage: Fragment() {
    lateinit var binding: ProfilepageBinding
    val signUpEmail = binding.etSignUpEmail
    val signUpPassword = binding.etSignUpPassword
    val signInEmail = binding.etSignInEmail
    val signInPassword = binding.etSignInPassword

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ProfilepageBinding.inflate(layoutInflater)

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val profile = null

    }



}