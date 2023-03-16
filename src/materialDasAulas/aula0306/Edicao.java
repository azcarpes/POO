package materialDasAulas.aula0306;

import java.time.LocalDate;

public class Edicao {

    private Integer numEdicao;
    private LocalDate date;
    private Double preco;



    public Edicao(Integer numEdicao, LocalDate date, Double preco) {
        this.numEdicao = numEdicao;
        this.date = date;
        this.preco = preco;
    }
}
