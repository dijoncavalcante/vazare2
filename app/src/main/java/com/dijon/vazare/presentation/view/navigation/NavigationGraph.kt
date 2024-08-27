package com.dijon.vazare.presentation.view.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.dijon.vazare.MainActivity
import com.dijon.vazare.commons.VazareConstants
import com.dijon.vazare.commons.VazareConstants.Navigation.ROOT_GRAPH
import com.dijon.vazare.commons.VazareConstants.Navigation.VAZARE_ROOT_GRAPH
import com.dijon.vazare.home.OutlinedTextFieldComponent
import com.dijon.vazare.home.TimePickerExamples
import com.dijon.vazare.home.VazareScreen
import com.dijon.vazare.routes.VazareRoutes

@Composable
fun NavigationGraph(
    navController: NavHostController,
    vazareRoute: VazareRoutes.VazareRoutes,
    activity: MainActivity
) {
    val startDestination = when (vazareRoute) {
        VazareRoutes.VazareRoutes.VAZARE -> VAZARE_ROOT_GRAPH
    }
    NavigationGraphRoutes(
        navController = navController,
        startDestination = startDestination,
        activity = activity
    )
}

@Composable
fun NavigationGraphRoutes(
    navController: NavHostController,
    startDestination: String,
    activity: MainActivity
) {
    NavHost(
        navController = navController,
        route = ROOT_GRAPH,
        startDestination = VAZARE_ROOT_GRAPH
    ){
        navigation(
            route = VAZARE_ROOT_GRAPH,
            startDestination = VazareConstants.Screen.VAZARE
        ) {
            composable(route = VazareNavigationScreen.Vazare.route){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(all = 16.dp)
                ) {
                    VazareScreen()
                }
            }
        }
    }
}
