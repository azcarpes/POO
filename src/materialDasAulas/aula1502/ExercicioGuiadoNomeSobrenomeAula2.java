package materialDasAulas.aula1502;

import java.util.Scanner;

public class ExercicioGuiadoNomeSobrenomeAula2 {
    /*Faça um programa Java que solicite do usuário seu nome e sobrenome
    separadamente, e a sua data de nascimento.
    Para a data solicite que o usuário digite 3 valores que representam o dia,
    mês e ano.
    Além disso,a partir das variáveis do nome e sobrenome obtenha em uma terceira
    com as iniciais do usuário. Em seguida, exiba uma mensagem, com seu nome completo,
    as iniciais do seu nome e sobrenome e sua data de nascimento no formato
    "dd / mm / aaaa" */

    //Pergunta: como simplificar a data de nascimento? Isso poderia causar algum problema?

    public static void main(String[] args) {
        String nome;
        String sobrenome;
        Integer dia;
        Integer mes;
        Integer ano;
        String iniciaisNome;

        Scanner sc = new Scanner(System.in); //cria um scanner para recuperar os dados digitados pelo usuário
        System.out.println("Informe um nome: "); // exibe a frase na tela
        nome = sc.next(); // ou nextLine() recupera a String digitada no console
        System.out.println("Informe um sobrenome: ");
        sobrenome = sc.next();
        System.out.println("Qual o dia de nascimento: ");
        dia = sc.nextInt(); //recupera a int digitada no console
        System.out.println("Qual o mês de nascimento: ");
        mes = sc.nextInt();
        System.out.println("Qual o ano de nascimento: ");
        ano = sc.nextInt();

        iniciaisNome = nome.charAt(0)  + sobrenome.substring(0,1);// substring recuperar letras a partir das posições. Passamos a possição inicial do indice até a final
        String dataNascimento =  dia.toString() + "/" + mes.toString() + "/" + ano.toString();

        System.out.println("Eu me chamo: " + nome + " " + sobrenome + ", minhas inciais são: " +
                iniciaisNome + ". Nasci em: " + dataNascimento);
    }

}
