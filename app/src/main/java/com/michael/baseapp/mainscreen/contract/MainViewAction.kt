package com.michael.baseapp.mainscreen.contract

import com.michael.baseapp.navigation.Destination

sealed interface MainViewAction {

    data class DestinationClicked(val destination: Destination) : MainViewAction
}
