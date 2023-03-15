package aulasDePOO.aula14marco;

public class AssociadoHabilitado extends Associado{

    private Double custoPiscina;
    private boolean habilitado;

    public AssociadoHabilitado(String numAssociado, String nome, Double valorMensal, String atividade, Double custoPiscina, boolean habilitado) {
        super(numAssociado, nome, valorMensal, atividade);
        this.custoPiscina = custoPiscina;
        this.habilitado = habilitado;
    }

    @Override
    public Double custoMensal() {
        return super.custoMensal() + custoPiscina;
    }
}
