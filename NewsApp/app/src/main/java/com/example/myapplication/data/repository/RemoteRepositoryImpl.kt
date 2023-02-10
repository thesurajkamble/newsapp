package com.example.myapplication.data.repository

import com.example.myapplication.data.api.NewsApi
import com.example.myapplication.data.api.Resource
import com.example.myapplication.domain.entities.NewsResponseEntity
import com.example.myapplication.domain.mappers.NewsResponseMapper
import com.example.myapplication.domain.repository.RemoteRepository
import javax.inject.Inject

class RemoteRepositoryImpl @Inject constructor(
    private val api : NewsApi
): RemoteRepository {
    override suspend fun getNews(country: String, apikey: String): Resource<NewsResponseEntity> {
       val res =  api.getNews(country, apikey)
        if(res.isSuccessful){
            res.body()?.let {
                return Resource.Success(data = NewsResponseMapper.map(it))
            }
            return Resource.Failure(message =  res.message())
        } else {
            return Resource.Failure( message = res.message())
        }
    }
}