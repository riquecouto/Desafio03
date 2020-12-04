package com.example.desafio03

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.desafio03.comics.Results
import kotlinx.coroutines.launch

class MainViewModel(val webService: WebService) : ViewModel() {
    var listComics = MutableLiveData<List<Results>>()

    fun getComics(offset: Int) {
        viewModelScope.launch {
            listComics.value = webService.getComicsRepo(offset).data.results
        }
    }
}