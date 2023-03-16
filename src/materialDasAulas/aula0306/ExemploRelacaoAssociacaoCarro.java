package materialDasAulas.aula0306;

public class ExemploRelacaoAssociacaoCarro {

    private int velicidadeMaxima;
    private String marca;

    // cria o relacionamento com a classe Motor, nese caso 1 pra 1
    private ExemploRelacaoAssociacaoMotor motor;

    // cria o relacionamento com a classe Roda, nese caso 1 (carro) pra muitas Rodas
    private ExemploRelacaoAssociacaoRoda[] rodas;

    public ExemploRelacaoAssociacaoCarro(int velicidadeMaxima, String marca) {
        this.velicidadeMaxima = velicidadeMaxima;
        this.marca = marca;
        ExemploRelacaoAssociacaoMotor motor = new ExemploRelacaoAssociacaoMotor();
    }

    public void teste(ExemploRelacaoAssociacaoMotor motor){
        System.out.println("atividade do metodo");
    }

}
