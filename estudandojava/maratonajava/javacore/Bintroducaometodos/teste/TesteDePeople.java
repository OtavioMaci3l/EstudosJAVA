package estudandojava.maratonajava.javacore.Bintroducaometodos.teste;

import estudandojava.maratonajava.javacore.Bintroducaometodos.dominio.People;

public class TesteDePeople {
    public static void main(String[] args) {
        People people = new People();
        //set para setar a variavel
        people.setName("Capybara");
        people.setAge(20);
        //get para obter o valor da variavel
        System.out.println(people.getName());
        System.out.println(people.getAge());
    }
}
