package estudandojava.maratonajava.introducao;

public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //ARRRAYS MULTIDIMENSIONAIS
        //sao basicamentes matrizes
        //arrays de arrays, ou seja lista de listas

        System.out.println("\nArray multidimensional tridimensional\n");

        int[][][] dias=new int[3][3][3];

        //atribuicao da lista tridimensional, o if e so pra diminui o codigo
        if(true){
            dias[0][0][0] = 1;
            dias[0][0][1] = 1;
            dias[0][0][2] = 1;

            dias[0][1][0] = 2;
            dias[0][1][1] = 2;
            dias[0][1][2] = 2;

            dias[0][2][0] = 3;
            dias[0][2][1] = 3;
            dias[0][2][2] = 3;

            dias[1][0][0] = 4;
            dias[1][0][1] = 4;
            dias[1][0][2] = 4;

            dias[1][1][0] = 5;
            dias[1][1][1] = 5;
            dias[1][1][2] = 5;

            dias[1][2][0] = 6;
            dias[1][2][1] = 6;
            dias[1][2][2] = 6;

            dias[2][0][0] = 7;
            dias[2][0][1] = 7;
            dias[2][0][2] = 7;

            dias[2][1][0] = 8;
            dias[2][1][1] = 8;
            dias[2][1][2] = 8;

            dias[2][2][0] = 9;
            dias[2][2][1] = 9;
            dias[2][2][2] = 9;
        }

        for(int i=0; i< dias.length; i++){
            for(int j=0; j<dias[i].length; j++) {
                for(int k=0; k<dias[i][j].length; k++){
                    System.out.println(dias[i][j][k]);
                }
            }
        }

        //obs: tem como fazer de quantos arrays quiser: exeplo: array[][][][][]

        System.out.println("\nArray Multidimensional bidimensional\n");

        int[][] aray = new int[3][3];

        aray[0][0] = 1;
        aray[0][1] = 2;
        aray[0][2] = 3;

        aray[1][0] = 4;
        aray[1][1] = 5;
        aray[1][2] = 6;

        aray[2][0] = 7;
        aray[2][1] = 8;
        aray[2][2] = 9;

        for(int i=0; i<aray.length; i++){
            for(int j=0; j<aray[i].length; j++){
                System.out.println(aray[i][j]);
            }
        }

        System.out.println("menos codigos -------------------------");
        //tambem da apra ultilizar foreach, melhor e menor
        for(int[] i: aray){ //o i vai atraz do endereço da memoria, e faz referencia a ela
            for(int j:i){ //e o j vai atraz da informacao do endereco de memoria
                System.out.println(j);
            }
        }
        System.out.println("\nseparando codigo ----------------------------\n\n");

        int[][] arrayInt=new int[3][];

        //cada indice do array faz referencia a um array de tamanho difente
        arrayInt[0]=new int[1];        //referencia a um array de 1 posicao
        arrayInt[1]=new int[2];        //referencia a um array de 2 posicoes
        arrayInt[2]=new int[]{1,2,3,}; //referenccia aum array de 3 posicoes, pode ser inicializado direto dessa forma

        for(int[] i:arrayInt){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println("\n----------------");
        }

        //tem como fazer dessa forma tambem:
        int[][] arrayInt2={{1},{2,3},{4,5,6}};
        for(int[] i:arrayInt2){
            for(int j:i){
                System.out.print(j);
            }
            System.out.println("\n");
        }

        //na real provavelmente nao vai usar arrays multidimensionais
        //por conta das colecoes, que os arrays multidimensionais seriam correspondidos ao map
    }
}
