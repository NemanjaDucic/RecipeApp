package com.example.recipeapp.View.HomeScreen

import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.databinding.HomeScreenLayoutBinding

class HomeScreenActivity:AppCompatActivity() {
    private lateinit var binding: HomeScreenLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeScreenLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}