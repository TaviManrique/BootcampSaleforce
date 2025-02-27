package com.manriquetavi.bootcampsaleforce

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class UserRepository @Inject constructor(private val userService: UserService) {
    fun fetchUsers(): Flow<List<User>> = flow {
        emit(userService.getUsers().results)
    }
}