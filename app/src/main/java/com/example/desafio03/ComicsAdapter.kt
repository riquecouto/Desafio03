package com.example.desafio03

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.example.desafio03.comics.Results
import kotlinx.android.synthetic.main.recycler_card.view.*

class ComicsAdapter(
    private val listComics: List<Results>,
    private val cardClickListener: CardClickListener
) : RecyclerView.Adapter<ComicsAdapter.ComicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComicViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_card, parent, false)
        return ComicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listComics.size
    }

    override fun onBindViewHolder(holder: ComicViewHolder, position: Int) {
        val imgURL = listComics[position].thumbnail.path + "." + listComics[position].thumbnail.extension

        Picasso.get().load(imgURL).into(holder.imageComic)
//        Picasso.get().load(imgURL.replace("http://", "https://")).into(holder.imageComic)
//        holder.numComic.text = listComics[position].title

        val title = "#" + listComics[position].title.substringAfter("#")
        holder.numComic.text = title

        holder.itemView.setOnClickListener {
            cardClickListener.onCardClickListener(listComics[position])
        }
    }

    inner class ComicViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageComic: ImageView = itemView.iv_recycler_card
        val numComic: TextView = itemView.tv_recycler_card
    }
}