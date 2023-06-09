package com.pacepdro.kastauibadah.android.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route)
        {

        }
        composable(route = BottomBarScreen.Calendar.route)
        {

        }
        composable(route = BottomBarScreen.Alkitab.route)
        {

        }
        composable(route = BottomBarScreen.Profile.route)
        {

        }
    }
}