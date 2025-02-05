package estudandojava.maratonajava.javacore.Eblocosinicializacao.testes;

import estudandojava.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("onenpiece");
        for (int episodeo : anime.getEpisodeos()) {
            System.out.print(episodeo+" ");
        }

    }
}
