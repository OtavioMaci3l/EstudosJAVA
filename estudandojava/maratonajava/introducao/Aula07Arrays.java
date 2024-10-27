package estudandojava.maratonajava.introducao;

public class Aula07Arrays {
    public static void main(String[] args) {
        //Arrays são listas
        int[] idade = new int[3];
        idade[0] = 1;
        idade[1] = 2;
        idade[2] = 3;
        System.out.println(idade[0]);
        System.out.println(idade[1]);
        System.out.println(idade[2]+"\n");

        //valores padroes de arrays com variaveis de tipo primitivo:
        //byte, short, int, long === 0
        //float, double === 0
        //char === '\u0000'
        //boolean === false

        //String === null; isso vale para qualquer outro tipo reference; obs: arrays são reference

        //obs: arrrays sempre serao objetos

        String[] nomes = new String[5];
        nomes[0] = "Luffy";
        nomes[1] = "Goku";
        nomes[2] = "A";
        nomes[3] = "b";
        nomes[4] = "_";
        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }

        System.out.println("\n"); //so pra organizar o console
        //legal
        int[] form1 = new int[5];
        int[] form2 = {0,1,2,3,4};
        int[] form3 = new int[]{0,1,2,3,4};
        for(int i=0; i<form2.length;i++){
            System.out.println(form1[i]);
        }


        System.out.println("\n"); //so pra deixa o console minimamente legivel
        //NOVO FOR
        //foreach(int i:array){}
        //ele so serve para listar o array sem incice especifico so vai lista
        for(int i:form3){
            System.out.println(i);
        }

        System.out.println("\n");  //só pra separa

        String[] form4={"a","b","c","d","e"};
        for(String cont:form4){
            System.out.println(cont);
        }
        //obs: a variavel local tem que ser do mesmo tipo do array
    }
}
