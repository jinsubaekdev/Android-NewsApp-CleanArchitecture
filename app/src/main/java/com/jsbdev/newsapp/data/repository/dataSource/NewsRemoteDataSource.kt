package com.jsbdev.newsapp.data.repository.dataSource

import com.jsbdev.newsapp.data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {

    suspend fun getTopHeadlines(): Response<APIResponse>
}