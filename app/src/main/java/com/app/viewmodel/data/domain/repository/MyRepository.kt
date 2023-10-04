package com.app.viewmodel.data.domain.repository

interface MyRepository {
    suspend fun doNetworkCall()
}