package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.data.model.APIResponse
import com.jsbdev.newsapp.data.util.Resource
import com.jsbdev.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(): Resource<APIResponse> {
        return newsRepository.getNewsHeadlines()
    }
}