package estudandojava.maratonajava.javacore.Gassociacao.dominio;

public class Professor {
    //MUITOS PARA UM
    private String nome;

    public Professor(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
