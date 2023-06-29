package com.example.diariodeclasse.data

import com.example.diariodeclasse.model.Aluno

class ListaDeAlunos {
    fun carregarListaDeAlunos():List<Aluno>{
        return listOf<Aluno>(
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
            Aluno("Rafael", "Eletrônica"),
        )
    }
}