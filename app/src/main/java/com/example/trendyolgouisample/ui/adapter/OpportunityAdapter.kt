package com.example.trendyolgouisample.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trendyolgouisample.data.entity.CardModel
import com.example.trendyolgouisample.databinding.OpportunityCardDesignBinding

class OpportunityAdapter(private var opportunityList: List<CardModel>) :
    RecyclerView.Adapter<OpportunityAdapter.OppViewHolder>() {
    class OppViewHolder(val binding: OpportunityCardDesignBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OppViewHolder {
        val binding =
            OpportunityCardDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OppViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OppViewHolder, position: Int) {
        val data = opportunityList[position]
        holder.binding.ivOpportunity.setImageResource(data.cardImage)
    }

    override fun getItemCount(): Int {
        return opportunityList.size
    }


}