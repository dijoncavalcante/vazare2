package com.dijon.vazare.presentation.view.navigation

import com.dijon.vazare.commons.VazareConstants

sealed class VazareNavigationScreen(val route: String) {
    object Vazare: VazareNavigationScreen(VazareConstants.Screen.VAZARE)
}