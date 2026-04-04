package com.marthanieto.coffeeandroid.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.marthanieto.coffeeandroid.domain.BannerModel
import com.marthanieto.coffeeandroid.domain.CategoryModel
import com.marthanieto.coffeeandroid.domain.ItemsModel
import com.marthanieto.coffeeandroid.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryModel>> {
        return repository.loadCategory()
    }

    fun loadBanner(): LiveData<MutableList<BannerModel>> {
        return repository.loadBanner()
    }

    fun loadPopular(): LiveData<MutableList<ItemsModel>> {
        return repository.loadPopular()
    }
}