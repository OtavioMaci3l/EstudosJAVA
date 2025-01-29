package estudandojava.maratonajava.revisando;

/*public class revisao {
    public static void main(String[] args) {
        String name = "V";
        int age = 22;
        double sal = 1500000.00;
        String date = "11/11/2022";
        System.out.println("Eu "+name+" com "+age+" anos\nrecebi "+sal+" na data de: "+date);
    }
}*/

/*public class revisao{
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        double resultado=n1/n2;
        //double resultado=n1/(double)n2; nao faça cast
        System.out.println(resultado);
    }
}*/

/*public class revisao{
    public static void main(String[] args) {
        byte dia=2;
        switch (dia){
            case 1:
            case 7:
                System.out.println("final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");
                break;

            default:
                System.out.println("Dia invalido");
        }
    }
}*/

/*public class revisao{
    public static void main(String[] args) {
        for (int i=0; i<=1000000; i++){
            if (i==999999){
                continue;
            }
            System.out.println(i);
        }
    }
}*/

//parcela maior que 1000
/*public class revisao{
    public static void main(String[] args) {
        double vt=30000.00;
        double parcela=vt;
        for(double i=1; parcela>1000; i++){
            parcela=30000/i;
            System.out.println(i+" x "+parcela);
        }
    }
}*/

//o continue só ignora o que ta em baixo e volta pro inicio do loop
/*public class revisao{
    public static void main(String[] args) {
        for (int i=0; i<10; i++){
            if (i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}*/

//arrays listas
/*public class revisao{
    public static void main(String[] args) {
        //int[] ages = null; //somente variaveis do tipo de referencia podem serem inicializadas com null, ou seja, nulo, nada
        //int age []; pode porem não recomendado
        int[] ages = new int[250];
        for(int i=0; i<250; i++){
            ages[i]=i;
        }
        for (int i=0; i<250; i++){
            System.out.println(ages[i]);
        }
    }
}*/

/*public class revisao{
    public static void main(String[] args) {
        String[] names=new String[3];
        names[0]="capivara";
        names[1]="capybara";
        names[2]="caquibara";
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }
    }
}*/

/*public class revisao {
    public static void main(String[] args) {
        int[] n=new int[3];
        int[] n2={1,2,3};
        int[] n3=new int[]{1,2,3};
        for (int i=0; i<n.length; i++) {
            System.out.println(n[i]);
        }
    }
}*/

//FOREACH, só uma versão simplificada do for, onde não tem um indice especifico e a variavel de referencia toma logo o valor do array um de cada vez
/*public class revisao{
    public static void main(String[] args) {
        int[] n=new int[]{1,2,3,4,5};
        for (int i:n){
            System.out.println(i);
        }
    }
}*/

//Arrays Multidimensionais, arrays de arrays de arrays de arrays de arrays...
/*public class revisao {
    public static void main(String[] args) {
        //meses : 1,2,3,4,5
        //dias  : 31,28,31,30

        int[][] dias = new int[3][3];
        dias[0][0]=31;
        dias[0][1]=28;
        dias[0][2]=31;

        dias[1][0]=31;
        dias[1][1]=28;
        dias[1][2]=31;

        dias[2][0]=31;
        dias[2][1]=28;
        dias[2][2]=31;

        for(int i=0; i < dias.length; i++){
            for(int j=0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
            System.out.println("\n");
        }

        //FOREACH, mesma coisa do for so que menas coisas
        //o i se torna uma variavel de referencia para os arrays e o j se torna cada valor em determinado indice do array, mesma coisa do for porem se indice
        for(int[] i:dias){
            for(int j:i){
                System.out.println(j);
            }
            System.out.println("\n");
        }
    }
}*/

//dessa forma cada indice do array multidimensional ta fazendo referencia a arrays de tamanhos diferentes
public class revisao {
    public static void main(String[] args) {
        int[][] ai = new int[3][];
        int[][] ia = {{1,2},{3,4,5},{6,7,8,9}}; //e tem como inicializar o array multidimensional diretamente

        ai[0] = new int[2];
        ai[1] = new int[3];
        ai[2] = new int[]{1,2,3,4,5,6}; //tem como inicializar o tamanho do array de um indice de um array multidimencional dessa forma

        for(int i=0; i < ai.length; i++){
            for(int j=0; j < ai[i].length; j++){
                ai[i][j]=j;
            }
        }

        /*for(int i=0; i < ai.length; i++){
            for(int j=0; j < ai[i].length; j++){
                System.out.println(ai[i][j]);
            }
            System.out.println("\n");
        }*/
        //na real parando pra analizar melhor esse FOREACH ele realmente simplifica bastante as coisas

        for(int[] i:ai){
            for(int j:i){
                System.out.println(j);
            }
            System.out.println("\n");
        }
    }
}