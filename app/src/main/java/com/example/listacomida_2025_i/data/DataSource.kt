package com.example.listacomida_2025_i.data

import com.example.listacomida_2025_i.R
import com.example.listacomida_2025_i.model.Platillo

class DataSource {

    fun loadPlatillos(): List<Platillo> {
        return listOf(
            Platillo(
                nombreId = R.string.platillo_desayuno,
                precio = 90.0,
                ofertaId = R.string.oferta_desayuno,
                imagenId = R.drawable.desayuno
            ),
            Platillo(
                nombreId = R.string.platillo_pozole,
                precio = 95.0,
                ofertaId = R.string.oferta_pozole,
                imagenId = R.drawable.pozole
            ),
            Platillo(
                nombreId = R.string.platillo_pizza,
                precio = 150.0,
                ofertaId = R.string.oferta_pizza,
                imagenId = R.drawable.pizza
            ),
            Platillo(
                nombreId = R.string.platillo_tacos,
                precio = 20.0,
                ofertaId = R.string.oferta_tacos,
                imagenId = R.drawable.tacos
            ),
            Platillo(
                nombreId = R.string.platillo_hamburger,
                precio = 85.0,
                ofertaId = R.string.oferta_hamburger,
                imagenId = R.drawable.hamburger
            ),
            Platillo(
                nombreId = R.string.platillo_postre,
                precio = 50.0,
                ofertaId = R.string.oferta_postre,
                imagenId = R.drawable.postre
             )
        )
    }
}
