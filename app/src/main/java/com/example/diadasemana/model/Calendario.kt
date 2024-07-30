package com.example.diadasemana.model

import java.util.Calendar

class Calendario {
    private val data: Calendar = Calendar.getInstance()

    fun diaDaSemana(): String {
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "Quarta", "QUINTA", "SEXTA", "SÁBADO")
        return dias[this.data.get(Calendar.DAY_OF_WEEK) - 1]
    }

    // Função para obter o dia da semana de uma data específica
    fun diaDaSemana(dia: Int, mes: Int, ano: Int): String {
        data.set(ano, mes - 1, dia) // Meses começam em 0 no Calendar
        val dias = arrayListOf("DOMINGO", "SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SÁBADO")
        return dias[data.get(Calendar.DAY_OF_WEEK) - 1]
    }
}