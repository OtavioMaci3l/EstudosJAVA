package estudandojava.maratonajava.javacore.Kenum.dominio;

import java.util.Stack;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente; // se usa Enumerações quando se tem uma escolha dentro de uma quantidade limitada de opções ou quando precisa forçar o tipo a ser ultilidado, pelo que eu entendi é meio que criar uma lista de variaveis constantes organizadamente

    // COM ENUMERAÇÃO

    public Cliente(String nome, TipoCliente tipoCliente) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    } // dessa forma deixa o código melhor, evitando mais erros, e o código fica menor e melhor

    // SEM ENUMERAÇÃO

//    public static final String PESSOA_FISICA = "PESSOA_FISICA";
//    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";

//    public Cliente() {
//    }
//
//    public Cliente(String nome, String tipo) { // só pra relembrar o ! negativa a condição a seguir
//        if(!tipo.equals(PESSOA_FISICA) && !tipo.equals(PESSOA_JURIDICA)){// .equals é para comparar Strings, e ele é sensivel a CAPSLOCK
//            return; // dessa forma se o que for digitado não for igual as condicoes o objeto nao e criado
//        }
//        this.nome = nome;
//        this.tipo = tipo;
//    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipoCliente + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
