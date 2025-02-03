package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    public String name;
    public int age;
    public char sexo;

    public void imprimir(int name, int age){
        System.out.println(name); //o this. serve para indicar que a varivel requerida é aquela declarada no próprio objeto,
        System.out.println(this.age); //como exemplo sem o this. a variavel name que foi ultilizada foi a passada pelo parametro,
        System.out.println(this.sexo); //porem se adicionarmos um this. antes da variavel nome a variavel que será ultilizada sera a variavel do objeto
        System.out.println("----------");
    }
}
