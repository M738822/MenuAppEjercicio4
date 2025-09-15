package com.example.listacomida_2025_i.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.listacomida_2025_i.model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .padding(12.dp)
            .fillMaxWidth()
            .heightIn(min = 140.dp),
        elevation = CardDefaults.cardElevation(6.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer
        )
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            // Imagen del platillo
            Image(
                painter = painterResource(id = platillo.imagenId),
                contentDescription = stringResource(id = platillo.nombreId),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(110.dp)
                    .aspectRatio(1f)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(20.dp))

            // Información del platillo
            Column(
                modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                // Nombre del platillo - Poppins
                Text(
                    text = stringResource(id = platillo.nombreId),
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.primary
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Precio - Merriweather
                Text(
                    text = "$${platillo.precio}",
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )

                Spacer(modifier = Modifier.height(6.dp))

                // Oferta - Oswald
                Text(
                    text = stringResource(id = platillo.ofertaId),
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.error
                )
            }
        }
    }
}




