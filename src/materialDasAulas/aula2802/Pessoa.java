package materialDasAulas.aula2802;

/* Uma classe é um modelo ou molde ABSTRATO onde são programados um conjunto de objetos
 com características afins, que possuem atributos (características) e métodos ou funções
 (comportamentos) comuns.*/

public class Pessoa {

    /*atributos: características distintas de um objeto.
     Estrutura: modificador de acesso + tipo de dado + nome escolhido*/
    private String nome; //wrapper
    private Integer idade; //wrapper
    private int quantidadeDedos; //tipo primitivo
    private Double peso; //wrapper

    //construtor: informa como um objeto deve ser criado
    public Pessoa(String nome, Integer idade, int quantidadeDedos, Double peso){
        this.nome = nome;
        this.idade = idade;
        this.quantidadeDedos = quantidadeDedos;
        this.peso = peso;
    }



    /*Método ou função: determina as ações ou responsabiliadades do objeto.
     Estrutura: modificador de acesso + tipo de retorno + nome escolhido: deve iniciar
     com um verbo*/


    // metodo sem retorno
    public void beber(String liquido){
        //ação ou responsabilidade feita ou realizada
        System.out.println("O(a) " + this.nome + " está bebendo " + liquido);
    }

    //metodo com retorno
    public String caminhar (){
        String retornoMetodo = this.nome + " está caminhando";
        System.out.println(retornoMetodo);
        return retornoMetodo;
    }

    /*get e set: Permite pegar e modificar os dados da Pessoa por outras classes*/
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public int getQuantidadeDedos() {
        return quantidadeDedos;
    }

    public void setQuantidadeDedos(int quantidadeDedos) {
        this.quantidadeDedos = quantidadeDedos;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}


