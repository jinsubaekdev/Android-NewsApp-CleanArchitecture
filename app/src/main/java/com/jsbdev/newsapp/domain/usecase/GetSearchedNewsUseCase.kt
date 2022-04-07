package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.data.model.APIResponse
import com.jsbdev.newsapp.data.util.Resource
import com.jsbdev.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String): Resource<APIResponse> {
        return newsRepository.getSearchedNews(searchQuery)
    }
}