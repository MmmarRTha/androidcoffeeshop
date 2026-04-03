package com.marthanieto.coffeeandroid.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.marthanieto.coffeeandroid.domain.CategoryDomain
import com.marthanieto.coffeeandroid.repository.MainRepository

class MainViewModel : ViewModel() {
    private val repository = MainRepository()

    fun loadCategory(): LiveData<MutableList<CategoryDomain>> {
        return repository.loadCategory()
    }
}