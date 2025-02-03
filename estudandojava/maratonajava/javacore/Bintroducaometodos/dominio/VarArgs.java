package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class VarArgs {
    public void somaArray(int[] array){
        int soma=0;
        for(int x: array){
            soma+=x;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... array){
        int soma=0;
        for(int x: array){
            soma+=x;
        }
        System.out.println(soma);
    }
}
