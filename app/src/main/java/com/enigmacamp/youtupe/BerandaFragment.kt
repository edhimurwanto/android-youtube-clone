package com.enigmacamp.youtupe

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.enigmacamp.youtupe.movie.Movie
import com.enigmacamp.youtupe.movie.MovieAdapter
import kotlinx.android.synthetic.main.fragment_beranda.*
import java.sql.Date

class BerandaFragment : Fragment() {

    var movies : ArrayList<Movie> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initView()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    fun initView(){
        movies.add(Movie("Avengers Invinity Wars", "", Date(2020, 1, 1), "Marvels Studio", 100000, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube-nocookie.com/embed/g5_w5XrC7Ts\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        movies.add(Movie("Avengers End Game", "", Date(2020, 1, 1), "Marvels Studio", 100000, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube-nocookie.com/embed/lHw-6AZvZ7I\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
        movies.add(Movie("The Chainsmokers & Coldplay Something Just Like This", "", Date(2020, 1, 1), "Coldplay", 100000, "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FM7MFYoylVs\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rv_movie_list.apply {
            layoutManager = LinearLayoutManager(activity)

            adapter = MovieAdapter(movies)
        }
    }
}