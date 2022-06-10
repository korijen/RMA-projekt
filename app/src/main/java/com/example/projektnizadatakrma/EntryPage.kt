package com.example.projektnizadatakrma

import android.content.ClipData
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.view.menu.MenuView
import com.example.projektnizadatakrma.databinding.EntrypageBinding


class EntryPage: AppCompatActivity() {
    lateinit var binding: EntrypageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EntrypageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val buttonClick = findViewById<Button>(R.id.startNewGame)
        buttonClick.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.NewGamePage::class.java)
            startActivity(intent)
        }

        val profileClick = findViewById<View>(R.id.profile);
        profileClick.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.ProfilePage::class.java)
            startActivity(intent)
        }
        val ivCreateQuiz = findViewById<ImageView>(R.id.ivCreateQuiz)
        ivCreateQuiz.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.CreateQuizPage::class.java)
            startActivity(intent)
        }
        val itLeaders = findViewById<View>(R.id.itLeaders);
        itLeaders.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.LeadersPage::class.java)
            startActivity(intent)
        }
        val itHome = findViewById<View>(R.id.itHome);
        itHome.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.EntryPage::class.java)
            startActivity(intent)
        }
        val itCreate = findViewById<View>(R.id.itCreate);
        itCreate.setOnClickListener {
            val intent = Intent(this, com.example.projektnizadatakrma.CreateQuizPage::class.java)
            startActivity(intent)
        }

    }

}