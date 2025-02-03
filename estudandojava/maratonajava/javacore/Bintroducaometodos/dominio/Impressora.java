package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Impressora {
    public void imprimeCoisas(Pessoa referencia){
        System.out.println(referencia.name);
        System.out.println(referencia.age);
        System.out.println(referencia.sexo);
        System.out.println("-------------");
    }
}
