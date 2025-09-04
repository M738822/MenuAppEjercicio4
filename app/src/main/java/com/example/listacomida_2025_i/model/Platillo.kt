package com.example.listacomida_2025_i.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Platillo(
    @StringRes val nombreId: Int,
    val precio: Double,
    @StringRes val ofertaId: Int,
    @DrawableRes val imagenId: Int
)
