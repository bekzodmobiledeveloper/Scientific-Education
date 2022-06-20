package com.example.scientificeducation.database

import com.example.scientificeducation.utils.Info


interface DatabaseService {

    fun addMovie(info: Info)
    fun getAllMovies(): ArrayList<Info>
    fun deleteMovie(info: Info)
    fun getMovieById(id: Int?): Info
}