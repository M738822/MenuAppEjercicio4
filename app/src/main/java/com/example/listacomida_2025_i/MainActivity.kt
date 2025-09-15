package com.example.listacomida_2025_i

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listacomida_2025_i.data.DataSource
import com.example.listacomida_2025_i.ui.theme.ListaComida2025ITheme
import com.example.listacomida_2025_i.ui.view.MenuCardList

//Código Actualizado con Cambio de Tema

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ListaComida2025ITheme(
                darkTheme = isSystemInDarkTheme()
            ) {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {
                                Text(
                                    text = "MenuApp",
                                    style = MaterialTheme.typography.titleLarge,
                                    color = MaterialTheme.colorScheme.onPrimary
                                )
                            },
                            colors = TopAppBarDefaults.topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primary
                            )
                        )
                    },
                    containerColor = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    MenuApp(Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun MenuApp(modifier: Modifier = Modifier) {
    MenuCardList(
        DataSource().loadPlatillos(),
        modifier
    )
}

@Preview(showBackground = true, name = "Modo Claro")
@Composable
fun MenuAppPreviewLight() {
    ListaComida2025ITheme(darkTheme = false) {
        MenuApp()
    }
}

@Preview(showBackground = true, name = "Modo Oscuro")
@Composable
fun MenuAppPreviewDark() {
    ListaComida2025ITheme(darkTheme = true) {
        MenuApp()
    }
}


