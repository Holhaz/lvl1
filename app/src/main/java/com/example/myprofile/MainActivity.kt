package com.example.myprofile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }

        val txtName = intent.getStringExtra("EMAIL_KEY")

        binding.textviewName.text = txtName
    }
}