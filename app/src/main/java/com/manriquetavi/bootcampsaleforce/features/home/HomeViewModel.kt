package com.manriquetavi.bootcampsaleforce.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.manriquetavi.bootcampsaleforce.User
import com.manriquetavi.bootcampsaleforce.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: UserRepository
): ViewModel() {

    private val _users = MutableStateFlow<List<User>>(emptyList())
    val users: StateFlow<List<User>> = _users

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            repository.fetchUsers().collect { userList ->
                _users.value = userList
            }
        }
    }


}