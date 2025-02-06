package estudandojava.maratonajava.javacore.Gassociacao.testes;

import estudandojava.maratonajava.javacore.Gassociacao.dominio.Jogador;
import estudandojava.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Napolitanado");
        Time time = new Time("Ki-R");
        jogador.setTime(time);
        jogador.imprimir();

    }
}
