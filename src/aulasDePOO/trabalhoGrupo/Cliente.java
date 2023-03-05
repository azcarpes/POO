package aulasDePOO.trabalhoGrupo;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private Double divida;

    public Cliente(int numeroCliente, String nome) {
        this.numeroCliente = numeroCliente;
        this.nome = nome;
    }

    public void aumentarDivida(Double valorEmprestimo) {
        Double dividaAumento = this.divida + valorEmprestimo;
        this.setDivida(dividaAumento);
        System.out.println("O cliente aumentou sua dívida em " + valorEmprestimo + "reais.");
    };

    public void pagarDivida (Double valorPago){
        Double divida = this.getDivida();
        Double dividaAtual = divida-valorPago;

        if (dividaAtual == 0){
            System.out.println("O cliente quitou sua divida");
        } else {
            System.out.println("O cliente pagou " + valorPago + " reais da sua dívida. Ainda restam " + dividaAtual + " reais a serem pagos");
        }

        this.setDivida(dividaAtual);

    };

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public String getNome() {
        return nome;
    }

    public Double getDivida() {
        return divida;
    }

    public void setDivida(Double divida) {
        this.divida = divida;
    }
}
