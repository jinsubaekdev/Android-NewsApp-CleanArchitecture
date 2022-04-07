package com.jsbdev.newsapp.domain.usecase

import com.jsbdev.newsapp.domain.repository.NewsRepository

class SaveNewsUseCase(private val newsRepository: NewsRepository) {
}