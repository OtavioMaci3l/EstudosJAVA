package estudandojava.maratonajava.javacore.Csobrecargametodos.teste;

import estudandojava.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akira", "TV", 138);
        anime.init("Akira", "TV", 138, "Ficção Cinêntifica | Cyberpunk");
//        anime.setNome("Akira");
//        anime.setTipo("TV");
//        anime.setEps(1038);
        anime.imprimir();
    }
}
