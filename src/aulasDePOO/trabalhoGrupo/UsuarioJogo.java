package aulasDePOO.trabalhoGrupo;

public class UsuarioJogo {

    //atributos
    private String nome;
    private String nickName;
    private int pontuacao;
    private int nivel;


    //Construtor

    public UsuarioJogo(String nome, String nickName) {
        this.nome = nome;
        this.nickName = nickName;
    }

    //Metodo

    public void aumentarPontuacao() {
        System.out.println("Oi"+ this.nickName +"sua pontuação aumentou");
    }

    public void subirNivel(){
        System.out.println("Você subiu de nivel");

    }

    public void bonus(int valor){
        System.out.println("Você ganhou um Bonus");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}