package estudandojava.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao {
    public static void main(String[] args) {

        //estruturas de repetição em java: while, do while, for

        //whileEstrutura(); //while

        //doWhileEstrutura(); //do while

        //forEstrutura(); //for

        //exercioFor(); //EXERCÍCIO

        //breakEmRepeticoes(); //BREAK em estruturas de repetição

        //exercicioBreak(); //EXERCICIO whit brak

        continueEmRepeticao(); //CONTINUE em estruturas de repetição

    }

    public static void whileEstrutura(){
        int count=0;
        while(count<10){
            System.out.println(count++);
        }
    }

    public static void doWhileEstrutura(){
        int count=10;
        do {
            System.out.println("Do while: "+ ++count);
        }while (count<10);
    }

    public static void forEstrutura(){
        for(int i=0; i<10; i++){
            System.out.println("For: "+i);
        }
    }

    public static void exercioFor(){
        //imprima todos os números pares de 0 a 1000000
        for(long i=0; i<1000000; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void breakEmRepeticoes(){
        //imprima os ultimos 25 numeros de um dado valor por exemplo 50
        int valorMax=50;
        for(long i=0; i<=valorMax; i++){
            System.out.println(i);
            if(i>=25){
                break;
            }
        }
    }

    public static void exercicioBreak(){
        //dado um valor de um carro decubra quantas vees ele pode ser parcelado
        //condição valorParcela >= 1000
        double valorCarro=30000.00;
        for(long parcela=1; parcela<=valorCarro; parcela++){
            double valorParcela=valorCarro/parcela;
            if(valorParcela<1000){
                break;
            }
            System.out.println("Pacela: "+parcela+" x R$"+valorParcela);
        }
    }

    public static void continueEmRepeticao(){
        //o continue ignora o que ta em baixo e só volt para o inicio da estrutura
        //ao contrario do break que invez de continuar do inicio quebra a estrutura
        //então o continue só volta ao inicio da estrutura mesmo
        //ultilizando o exemplo do exercicioBreak(); com algumas alterações
        double valorCarro=30000.00;
        for(long parcela=(int)valorCarro; parcela>=1; parcela--){
            double valorParcela=valorCarro/parcela;
            if(valorParcela<1000){
                continue; //esse continue diz não vai continua pra baixo, em vez disso volta ao inicio da estrutura
            }
            System.out.println("Pacela: "+parcela+" x R$"+valorParcela);
        }
    }
}
