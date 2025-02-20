package estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // const não pode ser alterado, e tem essa convensão própria, tudo em clapslock com palavra separadas por underlines, obrigatóriamente tem que ser STATIC
    static {
        /*VELOCIDADE_LIMITE = 250;*/
    }

    /*public Carro() {
        VELOCIDADE_LIMITE = 250; // para usar assim tem que tirar o STATIC na criação da variável // só que inicializar na propria criação da variavel faz mais sentido
    }*/

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
