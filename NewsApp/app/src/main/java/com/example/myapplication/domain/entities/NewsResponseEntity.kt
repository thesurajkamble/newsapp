package com.example.myapplication.domain.entities

import com.google.gson.annotations.SerializedName

data class NewsResponseEntity(
    val status: String,
    val article: List<ArticleEntity>
) {
    data class ArticleEntity(
        val author: String,
        val title: String,
        val description: String,
        val url: String,
        val urlToImage: String,
    )
}
