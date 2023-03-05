package aulasDePOO.trabalhoGrupo;

public class usuarios {
    public static void main(String[] args) {

        UsuarioJogo usuario1 = new UsuarioJogo("Pedro", "PedroDH");
        UsuarioJogo usuario2 = new UsuarioJogo("Maria", "MariaDH");

        usuario1.setNivel(10);
        usuario1.setPontuacao(250);

        usuario2.setNivel(8);
        usuario2.setPontuacao(180);

        System.out.println(usuario1.getNivel());

    }
}
