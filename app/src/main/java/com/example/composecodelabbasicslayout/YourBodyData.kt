package com.example.composecodelabbasicslayout

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class YourBodyData(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)
