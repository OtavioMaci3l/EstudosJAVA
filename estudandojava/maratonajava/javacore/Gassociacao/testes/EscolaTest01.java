package estudandojava.maratonajava.javacore.Gassociacao.testes;

import estudandojava.maratonajava.javacore.Gassociacao.dominio.Escola;
import estudandojava.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    //MUITOS PARA UM
    public static void main(String[] args) {
        Professor professor1 = new Professor("Thungtenio");
        Professor professor2 = new Professor("Argonizionio");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Yongsteniozonianio", professores);

        escola.imprime();
    }
}
