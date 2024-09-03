package com.example.trendyolgouisample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolgouisample.data.entity.CardModel
import com.example.trendyolgouisample.databinding.AdvCardDesignBinding

class AdvAdapter(private var advList: List<CardModel>) : RecyclerView.Adapter<AdvAdapter.AdvViewHolder>() {
    class AdvViewHolder(val binding: AdvCardDesignBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdvViewHolder {
        val binding =
            AdvCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AdvViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AdvViewHolder, position: Int) {
        val data = advList[position]

        holder.binding.ivAdv.setImageResource(data.cardImage)

    }

    override fun getItemCount(): Int {
        return advList.size
    }


}