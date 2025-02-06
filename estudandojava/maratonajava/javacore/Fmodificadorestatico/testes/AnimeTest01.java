package estudandojava.maratonajava.javacore.Fmodificadorestatico.testes;

import estudandojava.maratonajava.javacore.Fmodificadorestatico.domain.Anime;

public class AnimeTest01 {

    static{
        System.out.println("oi");
    }

    public static void main(String[] args) {
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();
        Anime anime3 = new Anime();
    }
}
