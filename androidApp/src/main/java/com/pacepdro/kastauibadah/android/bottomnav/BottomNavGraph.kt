package com.pacepdro.kastauibadah.android.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.google.accompanist.pager.ExperimentalPagerApi
import com.pacepdro.kastauibadah.android.screen.AlkitabScreen
import com.pacepdro.kastauibadah.android.screen.HomeLayout
import com.pacepdro.kastauibadah.android.screen.JadwalScreen
import com.pacepdro.kastauibadah.android.view.ViewPagerSlider

@ExperimentalPagerApi
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
        HomeLayout()
        }
        composable(route = BottomBarScreen.Calendar.route)
        {
        ViewPagerSlider()
        }
        composable(route = BottomBarScreen.Alkitab.route)
        {
            AlkitabScreen()
        }
        composable(route = BottomBarScreen.Profile.route)
        {
            JadwalScreen()
        }
    }
}