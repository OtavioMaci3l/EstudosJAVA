package estudandojava.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //opreadores aritimeticos: +  -  /  *
        int n1=10;
        int n2=20;
        double re= n1 / (double) n2;
        int r=n1+n2;

        //o + é um operador sobrecarregado
        System.out.println("\nresultado de n1 mais n2 é: "+r);
        System.out.println("result: "+n1+n2);
        System.out.println(n1+n2+"result\n");

        //restos: %
        int resto=20%2;
        System.out.println(resto+"\n");

        //logicos: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<=20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezDiferenteQueVinte = 10!=20;
        System.out.println("isDezMaiorQueVinte? "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte? "+isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte? "+isDezIgualQueVinte);
        System.out.println("isDezDiferenteQueVinte? "+isDezDiferenteQueVinte+"\n");

        // && (and)   || (or)   ! (no)
        //if else
        int age=29;
        float sal=3500f;
        boolean isDrentroDaLeiMaiorQueTrinta=age>=30 && sal>=4612;
        boolean isDrentroDaleiMenorQueTrinta=age<30 && sal>=3381;
        System.out.println("Maior que trinta: "+isDrentroDaLeiMaiorQueTrinta);
        System.out.println("Menor que trinta: "+isDrentroDaleiMenorQueTrinta+"");

        double valorTotalCorrente = 200;
        double valorTotalPolpansa = 10000;
        float valorPlayFive = 5000f;
        boolean isPlayFiveComprable = valorTotalPolpansa>valorPlayFive || valorTotalCorrente>valorPlayFive;
        System.out.println("isPlayFiveComprable? "+isDrentroDaleiMenorQueTrinta);


        //atribuição:  +  +=  -=  *=  /=  %=
        double bonus=1000;
        bonus+=10;
        bonus-=10;
        bonus/=10;
        bonus*=10;
        bonus%=10;
        System.out.println("\nbonus: "+bonus);

        //atribuição: -- ++
        double b2=0;
        System.out.println(b2++);
        b2=0;
        System.out.println(++b2);
    }
}
