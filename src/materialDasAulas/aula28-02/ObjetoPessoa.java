package com.aulasdepoo.aula5;

public class ObjetoPessoa {

    //criando objetos

    public static void main(String[] args) {
        //Classe molde -> escolher nomedoObjeto = new classe
        Pessoa pessoaJose = new Pessoa("Jose", 50, 7, 55.5);
        Pessoa pessoaMaria = new Pessoa("Maria", 26, 10, 89.9);

        //exemplo de get
        System.out.println("Nome: " + pessoaJose.getNome());
        System.out.println("Nome: " + pessoaMaria.getNome());

        //exemplo de chamar métodos
        pessoaJose.beber("Vodka");
        System.out.println(pessoaJose.caminhar());

        pessoaMaria.beber("Cerveja");

       pessoaMaria.caminhar();




    }

}
