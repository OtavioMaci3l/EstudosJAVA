package estudandojava.maratonajava.javacore.Heranca.testes;

import estudandojava.maratonajava.javacore.Heranca.dominio.Endereco;
import estudandojava.maratonajava.javacore.Heranca.dominio.Funcionario;
import estudandojava.maratonajava.javacore.Heranca.dominio.Pessoa;

public class TestesHeranca01 extends Pessoa {



    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua Capivalorenco");
        endereco.setCep("2436-376");

        Pessoa pessoa = new Pessoa("Graxinim");
        pessoa.setCpf("316.384.630-28");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Cledosvaldo");
        funcionario.setCpf("423.327.435-26");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(4097.21);

        pessoa.imprimir();
        System.out.println("\n-------------------\n");
        funcionario.imprimir();
        System.out.println("\n-------------------\n");
        endereco.imprimir();
        System.out.println("\n-------------------\n");
        Funcionario2 funcionario2 = new Funcionario2();
        funcionario2.imprime();



    }
}
