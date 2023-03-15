package com.aulasdepoo.aula1e2;

public class SintaxeVariaveis {

    /*Diferença de tipo primitivo para Wrapper:
    * - Tipo Primitivo (Inicial Minúscula) serve apenas para armazenar valor.
    *     Dica: se colocar um ponto (.) após uma variável primitiva perceberá
    *     que não tem nenhuma sugestão de método ou função.
    * - Wrapper (Inicial Maiúscula): é uma classe que engloba o tipo primitivo.
    *    Ela permite além de armazenar o valor realizar operações já programadas,
    *    permite receber valor null*/

    //exemplo de uma função com String que transformará o conteúdo da variável em maiúsculo
    public static void main(String[] args) {
        String nome = "Fulano";
        System.out.println("Conversão da variável nome para maiúsculo: " + nome.toUpperCase());
    }



}
