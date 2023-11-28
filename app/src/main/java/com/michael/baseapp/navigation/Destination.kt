package com.michael.baseapp.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.michael.common.ImmutableList
import com.michael.common.immutableListOf

sealed class Destination(val title: String, val icon: ImageVector? = null) {
    object Home : Destination("Home")
}

val destinations: ImmutableList<Destination> =
    immutableListOf(
        Destination.Home,
    )
