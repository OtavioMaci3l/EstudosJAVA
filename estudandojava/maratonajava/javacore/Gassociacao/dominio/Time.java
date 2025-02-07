package estudandojava.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    // MUITOS PARA MUITOS // dentro de jogador temos o time e dentro de time temos o jogador
    //atributos
    private String nome;
    private Jogador[] jogadores;

    //construtores
    public Time(String nome) {
        this.nome = nome;
    }
    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    //imprimir valores dos atributos
    public void imprimir(){
        System.out.println(this.nome);
        if (jogadores == null) return;
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public Jogador[] getJogadores() {
        return jogadores;
    }
}
