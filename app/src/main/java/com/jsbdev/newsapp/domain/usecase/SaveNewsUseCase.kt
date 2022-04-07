package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.data.model.Article
import com.jsbdev.newsapp.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article) = newsRepository.saveNews(article)
}