package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.domain.repository.NewsRepository

class GetNewsHeadlinesUseCase(private val newsRepository: NewsRepository) {
}