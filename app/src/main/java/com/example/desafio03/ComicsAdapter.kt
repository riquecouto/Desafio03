package com.example.desafio03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ComicsAdapter (private val listComics : ArrayList<Comics>) : RecyclerView.Adapter<ComicsAdapter.ComicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_card, parent, false)
        return ComicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listComics.size
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        holder.imageView.setImageResource(listComics[position].image)
    }

    inner class ComicViewHolder (itemView : View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_recycler_card)
    }
}