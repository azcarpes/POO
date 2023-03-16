package aulasDePOO.aula11;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private String cpf;

    //construtor com parametros para pessoa
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void calculaImc(String nome, int valorImc){
        System.out.println(nome + " seu IMC é:  " + valorImc );
    }

    public int calcularIdade(LocalDate dataNascimento){
        return LocalDate.now().getYear() - dataNascimento.getYear();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
