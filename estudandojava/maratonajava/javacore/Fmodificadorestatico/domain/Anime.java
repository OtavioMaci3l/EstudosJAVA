package estudandojava.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodeos;

    //Ordem de execução da Classe
    // 0 - Bloco de inicialização STATIC é executado quando a JVM executar a Class //na real tudo que é static é inicializado primeiro, poor isso que dentro de metodos, ou o bloco de inicialização, statics não se pode ultilizar atributos que não sejam statics, porque ainda não foram inicializados //e podemos chamar metodos estaticos dentro do bloco de inicialização statico, podendo fazer um algoritmo que seja garantido a execução de determinado código antes de tudo
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores defalt ou valores inicializados
    // 3 - Bloco de inicialização é executado
    // 4 - Contrutor é executado

    //BLOCOS DE INICIALIZAÇÃO NÃO ESTATICO || BLOCO DE INICIALIZAÇÃO DE INSTÂNCIA
    //bloco de inicialização é a primeira coisa que será executada, a diferença de usar isso para usar os contrutores, é que quando se tem varios contrutores não é preciso replicar o código em todos os contrutores, sendo o código escrito apenas uma vez, e será a primeira coisa a ser executada após o objeto ser criado
    static { //dessa forma o bloco de inicialização será executado apenas uma vez após a criação de um objeto derivado da classe, poupando processamento, ou seja, mesmo que mai de um objeto seja criado derivado dessa classe, o bloco de inicialização rodara apenas na primeira criação do objeto
        System.out.println("\nDentro do bloco de inicialização");
        Anime.episodeos = new int[100];
        for (int i = 0; i < Anime.episodeos.length; i++) {
            Anime.episodeos[i] = i+1;
        }
    }

    { //mesmo estando antes ele é o último bloco de inicialização a ser executado, porque ele não é static
        System.out.println("BLOC DE INICIALIZAÇÃO NÃO STATICO");
    }

    static{
        System.out.println("outro bloco de inicialização static");
    }
    static{
        System.out.println("OUTRO outro bloco de inicialização static");
    }

    public Anime(String nome) {
        this.nome = nome;
        for (int x : Anime.episodeos){
            System.out.print(x + " ");
        }
    }

    public Anime() {
        for (int x : Anime.episodeos){
            System.out.print(x + " ");
        }
    }

    public String getNome() {
        return nome;
    }
    public int[] getEpisodeos() {
        return episodeos;
    }
}
