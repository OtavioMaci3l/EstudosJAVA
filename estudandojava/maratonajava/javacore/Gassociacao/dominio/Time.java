package estudandojava.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    //UM PARA MUITOS

    //atributos
    private String nome;

    //construtor
    public Time(String nome) {
        this.nome = nome;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    //getters
    public String getNome() {
        return nome;
    }
}
