package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.data.model.Article
import com.jsbdev.newsapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.deleteNews(article)
}