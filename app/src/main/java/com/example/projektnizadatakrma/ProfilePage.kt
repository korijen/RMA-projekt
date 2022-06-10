package com.example.projektnizadatakrma

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.projektnizadatakrma.databinding.NewgamepageBinding
import com.example.projektnizadatakrma.databinding.ProfilepageBinding


class ProfilePage: AppCompatActivity() {
    lateinit var binding: ProfilepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProfilepageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnSignUp = findViewById<Button>(R.id.btSignUp)
        val btnSignIn = findViewById<Button>(R.id.btSignIn)
        btnSignUp.setOnClickListener{
            val etSignUpEmail = findViewById<EditText>(R.id.etSignUpEmail)
            val etSignUpPassword = findViewById<EditText>(R.id.etSignUpPassword)
            if(etSignUpEmail.text.isNotEmpty() && etSignUpEmail.text.isNotEmpty()) {
                Toast.makeText(this, "Succesfully signed up", Toast.LENGTH_SHORT).show()
            }


        }

        btnSignIn.setOnClickListener{
            val etSignInEmail = findViewById<EditText>(R.id.etSignInEmail)
            val etSignInPassword = findViewById<EditText>(R.id.etSignInPassword)
            if(etSignInEmail.text.isNotEmpty() && etSignInPassword.text.isNotEmpty()) {
                Toast.makeText(this, "Succesfully signed in", Toast.LENGTH_SHORT).show()
            }


        }

    }

}