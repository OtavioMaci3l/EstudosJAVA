package estudandojava.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int eps;
    private String genero;
    private String estudio;

    //CONSTRUTORES, não possuem retorno algum, e é a primeira coisa a ser executada numa Classe
    //OBS: apenas pelo abjeto ser criado o contrutor já é executao automaticamente, porem os atributos são inicializados antes memso disso
    //isso não é um metodo, isso é um contrutor, tem o exato mesmo nome da Classe
    //todos os arquivo class quando compilado recebe o contrution, pois é exencial para o funcionamento da Class
    //public void Anime(){}, isso é um metodo não um construtor, o contrutor não apresenta nenhum tipo de retorno
    public Anime(String nome, String tipo, int eps, String genero){
        this(); //esse this() só pode ser executado corretamente dentro de um contrutor, ou seja, só pode chamar um contrutor dentro de outro construtor
        this.nome = nome;
        this.tipo = tipo;
        this.eps = eps;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int eps, String genero, String estudio){
        this(nome, tipo, eps, genero); //o this() tem que ser necessariamente a primeira linha do código
        this.estudio = estudio;
        //this(nome, tipo, eps, genero); //não funciona
    }
    //e tem como aplicar o mesmo conceito de sobrecarga em construtores
    public Anime(){
        System.out.println("Dentro do construtor sem argumentos");
    }
    //agora no caso, para criar um objeto Anime tem que obrigatóriamente dar um nome para objeto ser criado

    //dessa forma não é mais necessário a ultilização do init, o set supremo,
    //pois agora para criar um objeto é necessário passar as informações sobre o anime no caso que é o objeto a ser criado

    //imprimir os valores dos atributos
    public void imprimir(){
        //this(); //não é possivel fazer isso
        System.out.println("Nome: "+this.nome);
        System.out.println("Tipo: "+this.tipo);
        System.out.println("Espisódeos: "+this.eps);
        System.out.println("Genero: "+this.genero);
        System.out.println("Estudio: "+this.estudio);
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
