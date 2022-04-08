package com.jsbdev.newsapp.data.repository.dataSourceImpl

import com.jsbdev.newsapp.data.api.NewsAPIService
import com.jsbdev.newsapp.data.model.APIResponse
import com.jsbdev.newsapp.data.repository.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country: String,
): NewsRemoteDataSource {
    override suspend fun getTopHeadlines(): Response<APIResponse> {
        return newsAPIService.getTopHeadlines(country)
    }
}