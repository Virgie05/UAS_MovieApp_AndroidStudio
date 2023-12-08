package com.christianrondonuwu.daftarfilmku.models

data class GetMovieResponseModel(
    val page:Int,
    val total_pages:Int,
    val total_results:Int,
    val results:ArrayList<MovieModel>
)
