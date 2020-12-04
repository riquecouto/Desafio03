package com.example.desafio03.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio03.Comics
import com.example.desafio03.ComicsAdapter
import com.example.desafio03.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private var listComics = ArrayList<Comics>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)

        listComics = getListComics()
//        rv_comics.apply {
            view.findViewById<RecyclerView>(R.id.rv_comics).apply {
            layoutManager = GridLayoutManager(view.context, 3)
            adapter = ComicsAdapter(listComics)
        }

        return view
//        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
    }

    private fun getListComics(): ArrayList<Comics> {
        return arrayListOf(
            Comics(R.drawable.ic_launcher_foreground),
            Comics(R.drawable.ic_launcher_background),
            Comics(R.drawable.ic_launcher_foreground),
            Comics(R.drawable.ic_launcher_background),
            Comics(R.drawable.ic_launcher_background),
            Comics(R.drawable.ic_launcher_background),
            Comics(R.drawable.ic_launcher_foreground),
            Comics(R.drawable.ic_launcher_background),
            Comics(R.drawable.ic_launcher_foreground),
            Comics(R.drawable.ic_launcher_foreground)
        )
    }
}