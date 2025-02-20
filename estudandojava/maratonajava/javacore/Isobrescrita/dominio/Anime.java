package estudandojava.maratonajava.javacore.Isobrescrita.dominio;

public class Anime /*extends Object*/ {
    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override // quando esta sobreescrevendo um metodo não é possivel diminuir a visibilidade do metodo para o código, apenas deixar igual ou almentar, ou seja se o metodo original é public o sobrescrito tem que ser public, porem se o metodo original é private o metodo sobreescrito pode ser private, protected ou public
    public String toString() {  // Alt + Ins tem a opção de criar esse metodo automaticamente
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }

    /*@Override // quadno der um erro quer dizer que não está sobrescrevendo outro metodo, apenas cirando um novo, e quando nao der erro quer dizer que esta sobrescrevendo um outro metodo
    public String toString(){ // o to string serve para imprimir no console a referencia quando, por exemplo, no caso, é chamado System.out.println(anime);
        return "Anime: "+this.nome;
    }*/  // porem não é necessário herdar Object toda vez

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
