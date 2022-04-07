package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.data.model.Article
import com.jsbdev.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
    fun execute(): Flow<List<Article>> {
        return newsRepository.getSavedNews()
    }
}