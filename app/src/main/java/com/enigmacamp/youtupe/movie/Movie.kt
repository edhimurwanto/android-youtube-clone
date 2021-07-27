package com.enigmacamp.youtupe.movie

import java.sql.Date

data class Movie(
        val title: String,
        val desc: String,
        val uploadedDate: Date,
        val author: String,
        val views: Int,
        val embded: String,
)
