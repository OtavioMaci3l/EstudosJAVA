package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Coisas {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subitraiDoisNumeros(){
        System.out.println(10-8);
    }

    public void multTwoNums(int x, int y){
        System.out.println(x*y);
    }

    public double divTwoNums(double x, double y){
        if(y == 0){
            return 0;
        }
        return x/y;
    }

    public void printDivTwoNums(double x, double y){
        if(y == 0){
            System.out.println("Não existe divisão por 0");
            return;
        }
        System.out.println(x/y);
    }

    public void inverTwoNums(int x, int y){
        int n;
        n = x;
        x = y;
        y = n;
        System.out.println(x);
        System.out.println(y);
    }

    public void estudante(){
        String name;
        int age;
        char sexo;
    }

    public void somaArray(int[] array){
        int soma=0;
        for(int x: array){
            soma+=x;
        }
        System.out.println(soma);
    }
}
