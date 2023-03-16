package materialDasAulas.aula0103;

public class MainEncapsulamento {

    public static void main(String[] args) {
        //como é static na classe não precisa usar o new
        Encapsulamento.chamarMetodoEstatico();
        System.out.println(Encapsulamento.getCorOlhos());

    }



    /*
    Em Java, static e final são duas palavras-chave que têm significados distintos.
    A palavra-chave static é usada para criar variáveis e métodos que pertencem à classe em si, em vez de pertencerem
     a instâncias individuais da classe. Isso significa que uma variável ou método estático pode ser acessado
     diretamente através do nome da classe, em vez de precisar de uma instância da classe para ser acessado.
     Além disso, as variáveis estáticas são compartilhadas entre todas as instâncias da classe e mantêm seu
     valor durante toda a vida útil do programa. Por outro lado, os métodos estáticos não podem acessar variáveis
     de instância, pois não têm acesso ao estado da instância atual.

    A palavra-chave final, por sua vez, é usada para criar constantes, ou seja, valores que não podem ser alterados
    depois de inicializados. Uma vez que uma variável é declarada como final, seu valor não pode ser alterado.
    Além disso, as classes final não podem ser estendidas por outras classes, e os métodos final não podem ser
    sobrescritos pelas subclasses.

    Em resumo, a principal diferença entre static e final é que static é usado para criar variáveis e métodos que
    pertencem à classe em si, enquanto final é usado para criar constantes ou impedir que classes ou métodos sejam
     alterados.
     */
}
