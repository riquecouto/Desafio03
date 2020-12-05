package com.example.desafio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.desafio03.comics.Results
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        setSupportActionBar(toolbar)
        getSupportActionBar()?.setDisplayShowTitleEnabled(false)

        toolbar.setNavigationOnClickListener {
            onBackPressed()
        }

        tv_comic_title.setText(intent.getStringExtra("title"))

        tv_comic_details.setText(intent.getStringExtra("description"))


        tv_published_details.setText(intent.getStringExtra("date"))

        tv_price_details.setText(intent.getStringExtra("price"))

        tv_pages_details.setText(intent.getStringExtra("pageCount"))

        Picasso.get().load(intent.getStringExtra("uri")).into(iv_comic_image)
        Picasso.get().load(intent.getStringExtra("uri")).into(iv_detail_background)
    }
}