package estudandojava.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        //IF ELSE
        //variavel ultilizada nos exemplos
        long age = 18;
        //negacao
        System.out.println(negacao(age));
        //if else
        ifelse(age);
        //ternário
        ternario(age);
        //EXERCICIO
        double salarioAnual = 40000;
        System.out.println("\nO imposto a ser paga é: " + exercicio(salarioAnual) + "\n");

        //SWITCH
        // char, int, byte, short, enum, String
        byte dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
        char sexo = 'M';
        switch (sexo) {
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
        //EXERCÍCIO
        //considerando 1 como domindo, dado um numero de 1 a 7 diga se é dia útil ou final de semana
        byte day=1;
        switch (day){
            case 1:
            case 7:
                System.out.println("\nFDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("\nDia útil");
                break;
            default:
            System.out.println("Opção invalida");
        }

    }

    public static String negacao(long age) {
        //negação: !
        boolean isAtorized = age < 18;
        String auto;
        if (!isAtorized) {
            auto = "compre aqui agora kkkkkkk";
        } else {
            auto = "não vai compra kkkkkkkkkk";
        }
        return auto;
    }

    public static void ifelse(long age) {

        //idade < 15 categoria infantil
        //idade >= 15 $$ idade < 18 categoria juvenil
        //idade >=18 categoria adulto

        String categ;
        if (age < 15) {
            categ = "\nategoria infantil\n";
        } else if (age < 18) {
            categ = "\nCategoria juvenil\n";
        } else {
            categ = "\nCategoria adulto\n";
        }
        System.out.println(categ);

    }

    public static void ternario(long age) {

        //operador ternário: ex: String result=condição ? verdadeiro : falso;
        //tipo planilhas
        String result = age > 10 ? "maior de 10 anos" : "menor de 10 ano";
        String result2 = age <= 10 ? "criança" : age > 10 && age < 18 ? "adolecente" : age >= 18 && age < 40 ? "jovem" : "adulto";
        System.out.println(result2);

    }

    public static double exercicio(double sal) {
        double taxa;
        if (sal <= 34712) {
            taxa = sal * 9.70 / 100;
        } else if (sal >= 34713 && sal <= 68507) {
            taxa = sal * 37.35 / 100;
        } else {
            taxa = sal * 49.50 / 100;
        }
        return taxa;
    }

}
