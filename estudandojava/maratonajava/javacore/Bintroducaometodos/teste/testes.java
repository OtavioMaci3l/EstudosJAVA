package estudandojava.maratonajava.javacore.Bintroducaometodos.teste;

import estudandojava.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class testes {
    public static void main(String[] args) {
        System.out.println("----------");
        int x=10;
        int y=20;

        Pessoa coisa2 = new Pessoa();
        coisa2.name = "capivara";
        coisa2.age = 20;
        coisa2.sexo = 'M';
        coisa2.imprimir(x,y);

        Pessoa coisa22 = new Pessoa();
        coisa22.name = "CAPYBARA";
        coisa22.age = 20;
        coisa22.sexo = 'C';
        coisa22.imprimir(x,y);
    }
}
