package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.domain.repository.NewsRepository

class DeleteSavedNewsUseCase(private val newsRepository: NewsRepository) {
}