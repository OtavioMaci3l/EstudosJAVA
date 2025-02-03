package estudandojava.maratonajava.javacore.Bintroducaometodos.teste;

import estudandojava.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "rodolfo";
        funcionario.age = 32;
        funcionario.salario = new double[]{5100.00, 7854.00, 34980.00};

        funcionario.imprimir();
        funcionario.media();
    }
}
