package estudandojava.maratonajava.javacore.Gassociacao.testes;

import estudandojava.maratonajava.javacore.Gassociacao.dominio.Jogador;
import estudandojava.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    //UM PARA MUITOS
    public static void main(String[] args) {

        // Associações:
        // - Unidirecional
        // - Bidirecional

        // tipos de associação
        // 1 -- 1 // um para um         // 1 pessoa pode pertencer apenas um login, e 1 login pertence apenas a uma pessoa
        // 1 -- N // um para muitos     // 1 time possui N jogadores // - Unidirecional: o jogador vai ter uma referência para o time, porem o time não vai ter uma referência para os jogadores, ou vice e versa
        // N -- 1 // Muitos para um     // N jogadores possuem 1 time
        // N -- N // Muitos para Muitos // N alunos possuem N cursos, e N cursos possuem N alunos // - Bidirecional: os alunos terão referência para seus cursos, e os cursos teram referência para seus alunos

        //cria os objetos
        Jogador jogador = new Jogador("Napolitanado");

        //cria um objeto em memória derivado da classe Time
        Time time = new Time("Ki-R");
        //o objeto em memória criado é passado como parâmetro para setTime(), onde o parâmetro requisitado é um objeto derivado da classe Time,
        //ou seja, um objeto que faça referência a um objeto em memória do tipo Time
        jogador.setTime(time);

        //imprime os atributos do objeto jogador derivado da Classe Jogador
        jogador.imprimir();
    }
}
