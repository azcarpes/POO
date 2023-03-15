package com.aulasdepoo.aula10;

import java.time.LocalDate;

public class Aluno extends Pessoa {
    private Double nota;

    public Aluno(String nome, String cpf, Double nota) {
        super(nome, cpf);
        this.nota = nota;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
