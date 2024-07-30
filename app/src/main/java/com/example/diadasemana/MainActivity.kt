package com.example.diadasemana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.diadasemana.model.Calendario
import com.example.diadasemana.ui.theme.DiaDaSemanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiaDaSemanaTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiaDaSemana(
                        // hoje = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DiaDaSemana(modifier: Modifier = Modifier) {
    val calendario = Calendario()
    val hoje = calendario.diaDaSemana()
    val diaEspecifico = calendario.diaDaSemana(15, 8, 2024)

    Row(modifier = modifier) {
        Text(text = "Dia de hoje: $hoje!", color = Color.Blue)
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Dia de 15/08/2024: $diaEspecifico!", color = Color.Blue)
    }
}


//@Composable
//fun DiaDaSemana(modifier: Modifier = Modifier) {
//    val hoje = Calendario().diaDaSemana()
//    Text(
//        text = "Dia: $hoje!",
//        modifier = modifier
//    )
//}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiaDaSemanaTheme {
        DiaDaSemana()
    }
}