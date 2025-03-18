package estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Comprador {
    private String nome;

    public Comprador() {
    }

    public Comprador(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Comprador{" +
                "nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
