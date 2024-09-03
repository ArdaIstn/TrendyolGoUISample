package com.example.trendyolgouisample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolgouisample.data.entity.CardModel
import com.example.trendyolgouisample.databinding.CuisineCardDesignBinding

class CuisineAdapter(private val cuisineList: List<CardModel>) :
    RecyclerView.Adapter<CuisineAdapter.CuisineViewHolder>() {

    class CuisineViewHolder(val binding: CuisineCardDesignBinding) :
        RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ): CuisineViewHolder {
        val binding =
            CuisineCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CuisineViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CuisineViewHolder, position: Int) {
        val data = cuisineList[position]
        holder.binding.ivCuisine.setImageResource(data.cardImage)
    }

    override fun getItemCount(): Int {
        return cuisineList.size
    }


}