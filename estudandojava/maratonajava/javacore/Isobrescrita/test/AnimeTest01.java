package estudandojava.maratonajava.javacore.Isobrescrita.test;

import estudandojava.maratonajava.javacore.Isobrescrita.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jutanoeniensianos");
        System.out.println(anime.toString()); // sempre que colocar uma variavel de referencia dentro do System.ou.println(); o toString() é chamado para imprimir o local da referencia no console
    }
}
