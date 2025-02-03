package estudandojava.maratonajava.javacore.Bintroducaometodos.teste;

import estudandojava.maratonajava.javacore.Bintroducaometodos.dominio.VarArgs;

public class Teste2 {
    public static void main(String[] args) {
        //calculadora.somaArray(new int[]{1,2,3,4,5}); //tem como passar array como argumento direto dessa forma

        VarArgs calc = new VarArgs();
        calc.somaVarArgs(1,2,3,4,5,6,7,8,9,0);
    }
}
