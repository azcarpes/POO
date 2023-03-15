package com.aulasdepoo.aula10;

import java.time.LocalDate;

//classe EMpregado herda da classe Pessoa pelo extends
//Observe que a classe vazia já da erro e pede pra implementar um construtor com o super
public class Empregado extends Pessoa{

    private Double salario;
    private Double descontos;
    private String arquivo;

    public Empregado(String nome, String cpf, Double descontos, String arquivo) {
        //super é responsavel por incovar o Contrutor da classe pessoa
        super(nome, cpf);
        this.salario = 30000D;
        this.descontos = descontos;
        this.arquivo = arquivo;
    }

    //sobrescrito modificando codigo
    @Override
    public void calculaImc(String nome, int valorImc){
        System.out.println(nome + " seu IMC é:  " + valorImc + ". Preste atenção nos valores consultando a tabela no Google.");
    }

    //sobrecarga
    public Double calcularSalario(Double valorHora){
        return valorHora * 40;
    }

    public Double calcularSalario(Double valorHora, Double quantidadeHoras){
        return valorHora * quantidadeHoras;
    }
}
