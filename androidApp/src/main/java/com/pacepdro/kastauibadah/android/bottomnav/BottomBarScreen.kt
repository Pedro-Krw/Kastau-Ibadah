package com.pacepdro.kastauibadah.android.bottomnav

import com.pacepdro.kastauibadah.android.R

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: Int,
    val icon_focused: Int
) {

    // for home
    object Home: BottomBarScreen(
        route = "home",
        title = "Home",
        icon = R.drawable.home,
        icon_focused = R.drawable.home
    )

    // for report
    object Calendar: BottomBarScreen(
        route = "calendar",
        title = "Calendar",
        icon = R.drawable.calendar,
        icon_focused = R.drawable.calendar
    )

    // for report
    object Alkitab: BottomBarScreen(
        route = "alkitab",
        title = "Alkitab",
        icon = R.drawable.book,
        icon_focused = R.drawable.book
    )

    object Profile: BottomBarScreen(
        route = "profile",
        title = "Profile",
        icon = R.drawable.person,
        icon_focused = R.drawable.person
    )

}
