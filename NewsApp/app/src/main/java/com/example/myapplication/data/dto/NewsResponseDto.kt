package com.example.myapplication.data.dto

import com.google.gson.annotations.SerializedName


data class NewsResponseDto(
    @SerializedName("status")
    val status: String?,

    @SerializedName("articles")
    val article: List<ArticleDto>
) {
    data class ArticleDto(
        @SerializedName("author")
        val author: String?,

        @SerializedName("title")
        val title: String?,

        @SerializedName("description")
        val description: String?,

        @SerializedName("url")
        val url: String?,

        @SerializedName("urlToImage")
        val urlToImage: String?,
    )
}

