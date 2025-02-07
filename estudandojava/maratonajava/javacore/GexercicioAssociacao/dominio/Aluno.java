package estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Aluno {
    // atributos
    private String nome;
    private int idade;
    private Seminario seminario;

    //construtores
    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno(String nome, int idade, Seminario seminario) {
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    //imprimir
    public void imprimir() {
        if (this.nome != null) {
            System.out.println("Nome        : " + this.nome);
        }
        System.out.println("Idade       : " + this.idade);
        if (this.seminario != null) {
            System.out.println("Seminario   : " + this.seminario.getNome());
        }

        System.out.println("\n");
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

}
