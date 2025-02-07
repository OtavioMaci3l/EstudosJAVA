package estudandojava.maratonajava.javacore.Gassociacao.testes;

import estudandojava.maratonajava.javacore.Gassociacao.dominio.Jogador;
import estudandojava.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        // cirando os objetos
        Jogador jogador1 = new Jogador("Fulanesco");
        Jogador jogador2 = new Jogador("Tungstenio");
        Time time = new Time("Cledosvaldiandia");

        //lista de jogadores
        Jogador[] jogadores = {jogador1,jogador2};

        //settando os argumentos
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----- Jogador -----");
        jogador1.imprimir();

        System.out.println("\n------ Time -------");
        time.imprimir();
    }
}
