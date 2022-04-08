package com.jsbdev.newsapp.data.api

import com.jsbdev.newsapp.BuildConfig
import com.jsbdev.newsapp.data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {

    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country: String,
        @Query("apiKey")
        apiKey: String = BuildConfig.API_KEY,
    ): Response<APIResponse>
}