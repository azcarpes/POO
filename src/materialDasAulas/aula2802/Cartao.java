package materialDasAulas.aula2802;

public class Cartao {

    private String titular;
    private Long numeroCartao;
    private int codigoSeguranca;


    public Cartao(String titular, Long numeroCartao) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
    }


    public Cartao(String titular, Long numeroCartao, int codigoSeguranca) {
        this.titular = titular;
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Long getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(Long numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public void setCodigoSeguranca(int codigoSeguranca) {
        this.codigoSeguranca = codigoSeguranca;
    }
}
