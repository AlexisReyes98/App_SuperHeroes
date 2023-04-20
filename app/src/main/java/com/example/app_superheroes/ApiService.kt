package com.example.app_superheroes

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/2515156595303772/search/{name}")
    suspend fun getSuperheroes(@Path("name") superheroName: String): Response<SuperHeroDataResponse>

    @GET("/api/2515156595303772/{id}")
    suspend fun getSuperheroDetail(@Path("id") superheroId: String): Response<SuperHeroDetailResponse>

}