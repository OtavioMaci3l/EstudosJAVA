package estudandojava.maratonajava.javacore.Gassociacao.testes;

import estudandojava.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogado1 = new Jogador("Jazzghost");
        Jogador jogado2 = new Jogador("AuthenticGames");
        Jogador jogado3 = new Jogador("Spok");
//        Jogador[] jogadores = new Jogador[3]; //também pode sser inicializado assim
        //uma lista de um objeto nada mais é do que uma lista de referencia para diveersos objetos, onde cada indice da lista se referencia a um objeto, com isso agora podemos ver que o mesmo objeto possui 2 referencias apontando para ele
        Jogador[] jogadores = {jogado1, jogado2, jogado3};
        for(Jogador jogador : jogadores){
            jogador.imprimir();
        }
    }
}
