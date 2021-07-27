package com.enigmacamp.youtupe.movie

import android.view.LayoutInflater
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.enigmacamp.youtupe.R

class MovieViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.movie_list_item, parent, false)) {

    private var title: TextView? = null
    private var author: TextView? = null
    private var uploadedDate: TextView? = null
    private var views: TextView? = null
    private var embed: WebView? = null

    init {
        title = itemView.findViewById(R.id.tv_title)
        author = itemView.findViewById(R.id.tv_author)
        uploadedDate = itemView.findViewById(R.id.tv_uploadedDate)
        views = itemView.findViewById(R.id.tv_views)
        embed = itemView.findViewById(R.id.iv_thumbnails_movie)
    }

    fun bind(movie: Movie){
        this.title?.text = movie.title
        this.author?.text = movie.author
        this.uploadedDate?.text = movie.uploadedDate.toString()
        "${movie.views.toString()} views".also { this.views?.text = it }
        this.embed?.loadData(movie.embded, "text/html", "utf-8")
        true.also { this.embed?.settings?.javaScriptEnabled = it }
        embed?.webChromeClient = object : WebChromeClient() {}
    }



}