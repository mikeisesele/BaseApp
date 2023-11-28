package com.michael.baseapp.navigation

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.michael.home.HomeScreen

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Destination.Home.title,
    ) {
        composable(route = Destination.Home.title) { HomeScreen() }
    }
}

@SuppressLint("RestrictedApi")
fun NavHostController.processNavigation(destination: Destination) {
    val doesStackContainDestination = currentBackStack.value.find { backStack ->
        backStack.destination.route != null && backStack.destination.route!!.contains(destination.title)
    } != null

    if (!doesStackContainDestination && destination != Destination.Home) {
        navigate(destination.title)
    } else if (doesStackContainDestination) {
        navigate(destination.title) {
            popUpTo(destination.title) {
                inclusive = false
            }
        }
    }
}
