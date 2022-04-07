package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.domain.repository.NewsRepository

class GetSearchedNewsUseCase(private val newsRepository: NewsRepository) {
}