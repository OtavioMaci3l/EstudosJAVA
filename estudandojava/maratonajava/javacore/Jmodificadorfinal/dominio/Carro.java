package estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio;

public /*final*/ class Carro { // dessa forma a classe não poderá herdala, o FINAL faz com que a classe não possa ser estendida
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250; // const não pode ser alterado, e tem essa convensão própria, tudo em clapslock com palavra separadas por underlines, obrigatóriamente tem que ser STATIC
    // normalmente qaudo tem uma variavel FINAL tambem vai ser STATIC, já que essa variavel não poderá ser alterada
    static {
        /*VELOCIDADE_LIMITE = 250;*/
    }

    public final void imprime(){
        System.out.println(this.nome);
    }

    public final Comprador COMPRADOR = new Comprador();

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