package com.michael.ui.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun LazyListScope.spacer(
    horizontal: Dp = 0.dp,
    vertical: Dp = 0.dp,
    key: Any? = null,
) {
    item(key) {
        Spacer(
            horizontal = horizontal,
            vertical = vertical,
        )
    }
}

@Composable
fun Spacer(
    horizontal: Dp = 0.dp,
    vertical: Dp = 0.dp,
) {
    Spacer(
        modifier = Modifier
            .width(horizontal)
            .height(vertical),
    )
}
