package estudandojava.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String genero;


    //set supremo, inicia todos os atributos
    public void init(String nome, String tipo, int eps){
        this.nome = nome;
        this.tipo = tipo;
        this.eps = eps;
        System.out.println("primeiro init");
    }
    //SOBRECARGA DE PARAMETROS, quando tem 2 metodos com o extado mesmo nome porem adição de mais parametros
    public void init(String nome, String tipo, int eps, String genero){
//        como é código repetido pode fazer isso
        init(nome, tipo, eps);
//        this.nome = nome;
//        this.tipo = tipo;
//        this.eps = eps;
        this.genero = genero;
        System.out.println("segundo init");
    }


    //imprimir os valores dos atributos
    public void imprimir(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Espisódeos: "+this.eps);
        System.out.println("Genero: "+this.genero);
    }

    //set
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setEps(int eps){
        this.eps = eps;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //get
    public String getTipo(){
        return this.tipo;
    }
    public int getEps(){
        return this.eps;
    }
    public String getNome(){
        return this.nome;
    }
    public String getGenero() {
        return genero;
    }
}
