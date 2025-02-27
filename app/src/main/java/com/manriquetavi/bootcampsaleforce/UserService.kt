package com.manriquetavi.bootcampsaleforce

import retrofit2.http.GET

interface UserService {
    @GET("api/?results=10")
    suspend fun getUsers(): ApiResponse
}