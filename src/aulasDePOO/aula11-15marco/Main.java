package com.aulasdepoo.aula10;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Diana", "085.6985.259-74", 9.8);
        aluno.calculaImc(aluno.getNome(), 10); //usa o metodo contendo os valores da classe mãe pq não foi sobrescrito
        aluno.calcularIdade(LocalDate.of(1995,05,05));

        Empregado empregado = new Empregado("Luiz", "025.158.698-58", 4.5, "arquivo1");
        aluno.calcularIdade(LocalDate.of(1980,02,15));

        //metodo sobrescrito na subclasse
        empregado.calculaImc(empregado.getNome(), 10); //carrega o metodo da classe filha pois foi sobrescrito

        //sobrecarga
        System.out.println("Salário é: " + empregado.calcularSalario(85.9,44.0));
        System.out.println("Salário é: " + empregado.calcularSalario(50.0));



    }



}
