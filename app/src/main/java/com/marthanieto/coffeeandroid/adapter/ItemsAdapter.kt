package com.marthanieto.coffeeandroid.adapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.marthanieto.coffeeandroid.databinding.ViewholderItemBinding
import com.marthanieto.coffeeandroid.domain.ItemsModel

class ItemsAdapter(val items: MutableList<ItemsModel>) :
    RecyclerView.Adapter<ItemsAdapter.Viewholder>() {
    lateinit var context: Context

    class Viewholder(val binding: ViewholderItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): ItemsAdapter.Viewholder {
        context = p0.context
        val binding = ViewholderItemBinding.inflate(LayoutInflater.from(context), p0, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(p0: ItemsAdapter.Viewholder, p1: Int) {
        p0.binding.titleTxt.text = items[p1].title
        p0.binding.priceTxt.text = "$" + items[p1].price.toString()
        p0.binding.subtitleTxt.text = items[p1].extra

        Glide.with(context)
            .load(items[p1].picUrl[0])
            .into(p0.binding.pic)
    }

    override fun getItemCount(): Int = items.size
}