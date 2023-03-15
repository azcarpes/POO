package aulasDePOO.aula3;

import java.util.Scanner;

public class DeclaracaoTipoPrimitivoEWrapper {

    public static void main(String[] args) {
        int numero = 0;

        System.out.println("o valor é " + numero);

// exercicio PG - MODULO 1 - estrutura de controle em JAVA:
        int umNumero = 40;
        int doisNumero = 20;
        int divisao = umNumero/doisNumero;

        if (umNumero % doisNumero == numero) {
            System.out.println(umNumero + " dividido por " + doisNumero + " é " + divisao);
        }

// exercicio PG - MODULO 1 - exemplos de classe:

        String primeira = "texto um";
        String segunda = "texto dois";

        if (primeira.equals(segunda)) {
            System.out.println("as frases sao iguais");
        } else {
            System.out.println("as frases sao diferentes");
        }

        Integer um = 1;
        Integer dois = 2;
        int comparar = um.compareTo(dois);

        if (um.equals(dois)) {
            System.out.println("os numeros sao iguais");
        } else if (comparar>0){
            System.out.println("um é maior que dois");
        } else {
            System.out.println("dois é maior que um");
        }

// exercicio PG - MODULO 1 - scanner:

        Scanner SC = new Scanner(System.in);

        String nome;
        String sobrenome;

        System.out.println("qual seu primeiro nome?");
        nome = SC.nextLine();
        System.out.println("qual seu sobrenome?");
        sobrenome = SC.nextLine();

        char inicialNome = nome.charAt(0);
        char inicialSobrenome = sobrenome.charAt(0);

        System.out.println("Sua sigla é " + inicialNome + inicialSobrenome);


// exercicio PG - MODULO 1 - variaveis - exercicio mesa:

        int numeroEscolhido;

        System.out.println("Digite um número primo");
        numeroEscolhido = SC.nextInt();

        boolean ehPrimo = verifyIsPrime(numeroEscolhido);

        if (ehPrimo) {
            System.out.println("Acertou, este é um número primo");
        } else {
            System.out.println("Errou, este não é um número primo");
        }

        //chamar funcao criada no exercicio funcoes:

        int num1 = 100;
        int num2 = 50;
        trueOrFalse(num1, num2);
    }

    //Function to return true or false if number 1 module number 2 is 0
    public static Boolean trueOrFalse(int num1, int num2) {
        boolean isModulo = num1 % num2 == 0;
        if (isModulo) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        return isModulo;
    }

    //Function to return if a number is prime or not
    public static Boolean verifyIsPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
}




