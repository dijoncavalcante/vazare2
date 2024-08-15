package com.dijon.vazare

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.dijon.vazare.commons.VazareConstants
import com.dijon.vazare.presentation.view.navigation.NavigationGraph
import com.dijon.vazare.routes.VazareRoutes
import com.dijon.vazare.ui.theme.Vazare2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val vazareRoute = getInitialRoute("vazare")
        setContent {
            Vazare2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        NavigationGraph(
                            navController = rememberNavController(),
                            vazareRoute = vazareRoute,
                            activity = this@MainActivity
                        )
                    }
                }
            }
        }
    }
}

private fun getInitialRoute(routeKey: String) : VazareRoutes.VazareRoutes {
    val route = when (routeKey) {
        VazareConstants.Routes.VAZARE -> VazareRoutes.VazareRoutes.VAZARE
        else -> VazareRoutes.VazareRoutes.VAZARE
    }
    return route
}