package com.example.myapplication.data.api

import com.example.myapplication.data.dto.NewsResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET("/v2/top-headlines")
    suspend fun getNews(
        @Query("country") country: String,
        @Query("apikey") apikey: String,
    ): Response<NewsResponseDto>
}