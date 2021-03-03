package com.gorkemkara.sampleproject.di.remote

import com.gorkemkara.sampleproject.model.Rocket
import retrofit2.http.GET

interface ApiService {

    @GET("/v3/rockets")
    suspend fun getRockets(): List<Rocket>
}