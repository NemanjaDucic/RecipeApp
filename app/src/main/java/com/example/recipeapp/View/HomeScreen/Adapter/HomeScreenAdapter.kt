package com.example.recipeapp.View.HomeScreen.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeapp.Model.CardViewDataModel
import com.example.recipeapp.View.CreateEditSegment.CreateEditActivity
import com.example.recipeapp.databinding.CardViewLayoutBinding


class HomeScreenAdapter() : RecyclerView.Adapter<HomeScreenAdapter.ViewHolder>() {
    private lateinit var cardViewList: List<CardViewDataModel>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            CardViewLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val cardViewList=cardViewList[position]

        holder.imageView.setImageResource(cardViewList.image)
        holder.name.text=cardViewList.nameOfFood
        holder.type.text=cardViewList.typeOfFood
        holder.rating.rating = cardViewList.rating
        holder.root.setOnClickListener {
            val intent=Intent(holder.root.context, CreateEditActivity::class.java)
//            intent.putExtra("some",cardViewList)
            holder.root.context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int {
        return cardViewList.size
    }

    class ViewHolder(private val binding: CardViewLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val imageView=binding.imageview
        val name=binding.name
        val type=binding.typeOfFood
        val rating=binding.foodRating
        val root = binding.root
    }
}