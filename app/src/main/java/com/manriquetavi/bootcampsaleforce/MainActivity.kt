package com.manriquetavi.bootcampsaleforce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.manriquetavi.bootcampsaleforce.ui.theme.BootcampSaleforceTheme
import com.manriquetavi.bootcampsaleforce.navigation.Screen
import com.manriquetavi.bootcampsaleforce.navigation.SetUpNavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BootcampSaleforceTheme {
                val navController = rememberNavController()
                SetUpNavGraph(
                    startDestination = Screen.Home.route,
                    rootNavController = navController
                )
            }
        }
    }
}

