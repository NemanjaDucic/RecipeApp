package com.example.recipeapp.View.SettingsSegment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.recipeapp.databinding.SettingsActivityLayoutBinding

class SettingsActivity:AppCompatActivity() {
    private lateinit var binding: SettingsActivityLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=SettingsActivityLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialViewSetup()
        //Listeners
        binding.logoutButton.setOnClickListener{
            //TODO firebase logout/ return to initial screen
        }
        binding.deleteAccountButton.setOnClickListener {
            //TODO firebase delete account/ return to initial screen

        }

    }

   private fun initialViewSetup(){
    //TODO image view set profile picture
   // TODO text view set email used
    }
}