package aulasDePOO.aula15marco.exercicio;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public String emitirSom() {
      String som = "latir";
      return som;

    }
}
