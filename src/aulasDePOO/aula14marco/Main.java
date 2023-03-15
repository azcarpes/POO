package aulasDePOO.aula14marco;

public class Main {
    public static void main(String[] args) {
        Associado um = new Associado("123", "joao", 237.60, "natacao");

        System.out.println("o associado " + um.getNome() + " paga " + um.getValorMensal() + " para praticar " + um.getAtividade());
    }
}
