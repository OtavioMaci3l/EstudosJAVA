package estudandojava.maratonajava.introducao;

public class Aula02TiposPrimitivos{
    public static void main(String[] args) {
        //tipos primitivos são esses valores simples
        //int, double, float, char, byte, short, long, boolean

        //numeros inteiros só varia o tamanho que pode ser armazenado
        byte ageB=1;
        short ageS=2;
        int ageI=(int)100000000000L; //isso força o int alocar um long mesmo não cabendo, corta bits pra cabe, isso se chama cast, não é bão
        //int ageI=4;
        long ageL=65;

        //numeros decimais tbm só altera o tamanho
        double moneyD=4.434;
        //double moneyD=4.434d;
        float moneyF=8.778f;

        //verdadeiro ou falso
        boolean trueses=true;
        boolean falses=false;

        //caracter, formas de representar
        char caracter=(char) ageL; //da pra fazer isso com cast tambem
        //char caracter=65;
        //char caracter='\u0041';
        //char caracter='a';

        System.out.println(caracter); //tipos primitivos

        //String
        String name="una String legal";
        System.out.println("essa String é : "+name);

        //var transforma java em uma linguagem não tipada, só que só funciona no lvl 10
          /**var number=32;
            var sla=8.32;
            var pou="bunitin";
            var car='a';
            var lon=778624763;*/
    }
}
