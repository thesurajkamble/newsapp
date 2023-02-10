package com.example.myapplication.domain.mappers

interface Mapper <T,R> {
    fun map(input: T): R
}