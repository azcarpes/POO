package materialDasAulas.aula0306;

public class ExemploRelacaoComposicaoTelevisao {

    //Uma televisão não faz sentido sem uma tela

    private String marca;
    private ExemploRelacaoComposicaoTela tela;

    //como queremos que a TV sempre tenha uma tela forçamos no construtor que isso aconteça.
    //Sempre que um objeto de tv for criado será criado também uma tela
    public ExemploRelacaoComposicaoTelevisao(){
        tela = new ExemploRelacaoComposicaoTela();
    }



}
