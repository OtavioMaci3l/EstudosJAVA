package estudandojava.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    public void imprimir() {
        System.out.println(this.nome);
        if(this.time != null){
            System.out.println(this.time.getNome());
        }
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Time getTime() {
        return time;
    }
}
