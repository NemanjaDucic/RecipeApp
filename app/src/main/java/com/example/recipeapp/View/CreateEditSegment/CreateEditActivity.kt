package com.example.recipeapp.View.CreateEditSegment

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.indices
import com.example.recipeapp.databinding.CreateEditLayoutActivityBinding

class CreateEditActivity : AppCompatActivity()  {

    private lateinit var binding: CreateEditLayoutActivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=CreateEditLayoutActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialViewSetup()



    }

    private fun initialViewSetup() {

        val servingsNumber=arrayOf("1", "2", "3", "4", "5", "6", "7", "8")
        val timeInterval=arrayOf(1..60)
        val foodType=arrayOf("Breakfast", "Launch", "Dinner", "Snack")

//            foodType.indexOf(1)

        val foodSpinner=binding.foodTypeSpinner
        val timeSpinner=binding.timeSpinner
        val servingsSpinner=binding.servingsSpinner
        foodSpinner.adapter=ArrayAdapter(this, R.layout.simple_list_item_1, foodType)
        timeSpinner.adapter=ArrayAdapter(this, R.layout.simple_list_item_1, timeInterval)
        servingsSpinner.adapter=ArrayAdapter(this, R.layout.simple_list_item_1, servingsNumber)
        val foodIndex=1
        val timeIndex=1
//            timeInterval.indexOf(1)
        val servingsIndex=1
//            servingsNumber.indexOf(1)

        if (foodIndex >= 0) {
            foodSpinner.setSelection(foodIndex)
        }
        if (timeIndex >= 0) {
            timeSpinner.setSelection(timeIndex)
        }
        if (servingsIndex >= 0) {
            servingsSpinner.setSelection(servingsIndex)
        }
        foodSpinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (parent.getItemAtPosition(position) == "Choose Football players from lis") {
                } else {
                    val item=parent.getItemAtPosition(position).toString()
                    Toast.makeText(parent.context, "Selected: $item", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }


        }

    }


}