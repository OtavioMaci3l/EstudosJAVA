package estudandojava.maratonajava.revisando.introducaoclasses.testes;

import estudandojava.maratonajava.revisando.introducaoclasses.classes.Clas;

public class Testess {
    public static void main(String[] args) {
        Clas coisa = new Clas();
        coisa.nome = "capibara";
        coisa.modelo = "A32JF-98";
        coisa.ano = 2025;

        Clas coisa2 = new Clas();
        coisa2.nome = "Jacrome";
        coisa2.modelo = "YT69-MOL";
        coisa2.ano = 2025;

        coisa = coisa2;


        System.out.println(coisa.nome + " " + coisa.modelo + " " + coisa.ano);
        System.out.println(coisa2.nome + " " + coisa2.modelo + " " + coisa2.ano);
    }
}
