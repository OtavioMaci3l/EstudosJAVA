package estudandojava.maratonajava.javacore.Gassociacao.dominio;

//import estudandojava.maratonajava.javacore.Fmodificadorestatico.domain.Anime;

public class Jogador {
    //UM PARA MUITOS

    // ASSOCIAÇÃO UNIDIRECIONAL já que o jogador tem referência ao time porem o time não tem referência aos jogadores;

    //atributos
    private String nome;
    //isso é uma associação já que esta associando, linkando, uma classe com outra, agora essa variável é uma variável de refeferência que apontara para outro objeto,
    //dessa forma essa classe tem acesso às informações contidas na classe, a qual essa variavel faz referência
    private Time time;

//    private Anime anime; // também é possível associar a classe com classes em outros packets, contanto que o packet seja importado

    //construtores
    public Jogador(String nome) {
        this.nome = nome;
    }
    public Jogador(String nome, Time time) {
        this.nome = nome;
        this.time = time;
    }

    //imprime
    public void imprimir() {
        System.out.println(this.nome);
        if(this.time != null){
            System.out.println(this.time.getNome());
        }
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTime(Time time) {
        this.time = time;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public Time getTime() {
        return time;
    }
}
