package com.example.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    private lateinit var viewModel: MainViewModel

    private val viewModel by viewModels<MainViewModel> {
        object : ViewModelProvider.Factory {
            override fun <T : ViewModel?> create(modelCLass: Class<T>): T {
                return MainViewModel(webService) as T
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_comics.apply {
            layoutManager = GridLayoutManager(context, 3)
//            adapter = ComicsAdapter(listComics)
        }

        viewModel.listComics.observe(this) {
            rv_comics.adapter = ComicsAdapter(it)
        }
        viewModel.getComics(1)
    }
}