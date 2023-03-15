package com.aulasdepoo.aula4e5;

public class MainEncapsulamento {

    public static void main(String[] args) {
        //como é static na classe não precisa usar o new
        Encapsulamento.chamarMetodoEstatico();
        System.out.println(Encapsulamento.getCorOlhos());

    }
}
