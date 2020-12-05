package com.example.desafio03

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.desafio03.comics.Results
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), CardClickListener {

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
        }

        viewModel.listComics.observe(this) {
            rv_comics.adapter = ComicsAdapter(it, this)
        }
        viewModel.getComics(1)
    }


    override fun onCardClickListener(data: Results) {
        viewModel.listComics.observe(this, {

            val uri = data.thumbnail.path + "/portrait_uncanny." + data.thumbnail.extension

            val intent = Intent(this, DetailsActivity::class.java).apply {
                putExtras (bundleOf (
                    "title" to data.title,
                    "description" to data.description,
                    "date" to data.dates[0].date,
                    "price" to data.prices[0].price,
                    "uri" to uri,
                    "pageCount" to data.pageCount
                ))
            }
            startActivity(intent)
        })
    }
}