package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.domain.repository.NewsRepository

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
}