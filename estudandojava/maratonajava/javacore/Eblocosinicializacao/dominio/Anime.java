package estudandojava.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {
    private String nome;
    private int[] episodeos;

    //Ordem de execução da Classe
    // 1 - Alocado espaço em memória para o objeto
    // 2 - Cada atributo de classe é criado e inicializado com valores defalt ou valores inicializados
    // 3 - Bloco de inicialização é executado
    // 4 - Contrutor é executado

    //BLOCOS DE INICIALIZAÇÃO NÃO ESTATICO || BLOCO DE INICIALIZAÇÃO DE INSTÂNCIA
    //bloco de inicialização é a primeira coisa que será executada, a diferença de usar isso para usar os contrutores, é que quando se tem varios contrutores não é preciso replicar o código em todos os contrutores, sendo o código escrito apenas uma vez, e será a primeira coisa a ser executada após o objeto ser criado
    {
        System.out.println("Dentro do bloco de inicialização");
    }

    public Anime(String nome) {
        this.nome = nome;
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i+1;
        }
    }

    public Anime() {
        for (int x : episodeos){
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
