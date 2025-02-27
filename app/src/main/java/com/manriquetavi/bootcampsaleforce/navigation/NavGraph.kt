package com.manriquetavi.bootcampsaleforce.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.manriquetavi.bootcampsaleforce.features.home.HomeScreen
import com.manriquetavi.bootcampsaleforce.features.home.HomeViewModel

@Composable
fun SetUpNavGraph(
    startDestination: String,
    rootNavController: NavHostController
) {
    NavHost(
        navController = rootNavController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Home.route) {
            val viewModel: HomeViewModel = hiltViewModel()
            val users = viewModel.users.collectAsStateWithLifecycle()
            HomeScreen()
        }
    }

}

sealed class Screen(val route: String) {
    data object Home : Screen("home_screen")
    data object Detail: Screen("detail_screen")
}