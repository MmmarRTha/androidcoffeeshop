package com.marthanieto.coffeeandroid.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.core.Context
import com.marthanieto.coffeeandroid.databinding.ViewholderCategoryBinding
import com.marthanieto.coffeeandroid.domain.CategoryDomain

class CategoryAdapter(val items: MutableList<CategoryDomain>) :
    RecyclerView.Adapter<CategoryAdapter.Viewholder>() {
    private lateinit var context: Context
    private val selectedPosition = -1
    private val lastSelectedPosition = -1


    class Viewholder(val binding: ViewholderCategoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoryAdapter.Viewholder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(p0: CategoryAdapter.Viewholder, p1: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}