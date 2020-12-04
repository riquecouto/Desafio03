package com.example.desafio03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio03.comics.Results
import kotlinx.android.synthetic.main.recycler_card.view.*

class ComicsAdapter(private val listComics: List<Results>) : RecyclerView.Adapter<ComicsAdapter.ComicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_card, parent, false)
        return ComicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listComics.size
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        holder.numComic.text = listComics[position].title
//          holder.imageComic.setImageResource(listComics[position].image)
//        holder.imageView.setImageResource(listComics[position].image)
    }

    inner class ComicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val imageComic: ImageView = itemView.iv_recycler_card
        val numComic: TextView = itemView.tv_recycler_card
    }
}