package com.example.listacomida_2025_i.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.listacomida_2025_i.model.Platillo

@Composable
fun MenuCardList(platillos: List<Platillo>, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.tertiaryContainer)
    ) {
        items(platillos) { platillo ->
            MenuCard(platillo = platillo)
        }
    }
}










