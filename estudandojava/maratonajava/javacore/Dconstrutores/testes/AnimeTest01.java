package estudandojava.maratonajava.javacore.Dconstrutores.testes;

import estudandojava.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akira", "TV", 138, "Ficção Cinêntifica | Cyberpunk", "não sei");
        anime.imprimir();
    }
}
