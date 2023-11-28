package com.michael.baseapp.mainscreen.contract

import com.michael.base.contract.SideEffect
import com.michael.baseapp.navigation.Destination

sealed class MainSideEffect : SideEffect {
    data class NavigateToDestination(val destination: Destination) : MainSideEffect()
}
