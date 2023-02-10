package com.example.myapplication.domain.repository

import com.example.myapplication.data.api.Resource
import com.example.myapplication.domain.entities.NewsResponseEntity

interface RemoteRepository {
    suspend fun getNews(
        country: String,
        apikey: String,
    ): Resource<NewsResponseEntity>
}