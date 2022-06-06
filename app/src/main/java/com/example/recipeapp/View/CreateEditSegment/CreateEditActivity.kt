package com.example.recipeapp.View.CreateEditSegment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.databinding.CreateEditLayoutActivityBinding

class CreateEditActivity:AppCompatActivity() {
    private lateinit var binding: CreateEditLayoutActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = CreateEditLayoutActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialViewSetup()

    }
    private fun initialViewSetup(){
        val foodType = arrayOf("Breakfast","Launch","Dinner","Snack")
        val servingsNumber = arrayOf("1","2","3","4","5","6","7","8")
        val timeInterval = arrayOf(1..60)
    }
}