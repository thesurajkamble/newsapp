package com.example.myapplication.domain.mappers

import com.example.myapplication.data.dto.NewsResponseDto
import com.example.myapplication.domain.entities.NewsResponseEntity

object NewsResponseMapper : Mapper<NewsResponseDto,NewsResponseEntity> {
    override fun map(input: NewsResponseDto): NewsResponseEntity {
        return NewsResponseEntity(
            status = input.status.orEmpty(),
            article = input.article.map {
                NewsResponseEntity.ArticleEntity(
                    author = it.author.orEmpty(),
                    title = it.title.orEmpty(),
                    description = it.description.orEmpty(),
                    url = it.url.orEmpty(),
                    urlToImage = it.urlToImage.orEmpty()
                )
            }
        )
    }

}