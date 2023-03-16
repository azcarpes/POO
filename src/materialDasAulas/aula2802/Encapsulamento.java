package materialDasAulas.aula2802;

public class Encapsulamento {

    /*Encapsulamento: colocar em cápsulas, PROTEGER o conteúdo interno.
        Em POO evite que qualquer outro objeto tenha acesso à estrutura
        interna de um objeto.

      Objetivo: ocultação da informação e ocultação da implementação.
        Sem encapsulamento qualquer programa pode acessar um conjunto de
        dados. O acesso de dados de uma entidade deve ser restrito e é o dev
        que tem controle quais programas podem acessar quais informações atrafvés
        dos modificadores de acesso.

      Por exemplo,objeto Pessoa cujo atributo é a chave de acesso do banco, não seria conveniente
       que todos os objetos pudessem acessar livremente esse atributo. O objeto Pessoa deve estabelecer
       um método controlado e seguro para retornar a chave de acesso do banco, por exemplo, se as
       medidas de segurança forem atendidas.

      Modificadores de acesso: private/privado public/público protected/protegido
     */

    private String nome;
    private Integer cpf;
    private Boolean isMaiorIdade;
    private boolean isMaiorIdade1;
    private Double salario;

    //Estático (static): é possível acessar em outra classe sem criar um objeto (new)
    //É um atributo que será o mesmo em todos os lugares onde é acessado
    private static String corOlhos = "Azul";


    public static void chamarMetodoEstatico(){
        //metodo static
        System.out.println("Método estático");
    }


    /*Getters and Setters*/

    //Atalho para get e set: alt insert, escolher getter e setters ou Botão direito dentro da classe - GENERATE - getters and setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Boolean getMaiorIdade() {
        return isMaiorIdade;
    }

    public void setMaiorIdade(Boolean maiorIdade) {
        isMaiorIdade = maiorIdade;
    }

    public boolean isMaiorIdade1() {
        return isMaiorIdade1;
    }

    public void setMaiorIdade1(boolean maiorIdade1) {
        isMaiorIdade1 = maiorIdade1;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public static String getCorOlhos() {
        return corOlhos;
    }

    public static void setCorOlhos(String corOlhos) {
        Encapsulamento.corOlhos = corOlhos;
    }
}
