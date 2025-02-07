package estudandojava.maratonajava.javacore.Gassociacao.testes;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Idade: ");
        int idade = input.nextInt();
        System.out.print("Sexo [H/M]: ");
        char sexo = input.next().charAt(0);
        for (int i = 0; i<5; i++){
            sexo = input.next().charAt(0);
        }

        System.out.println("\n----- INFORMAÇÕES -----\n");
        System.out.println(nome + idade + sexo);
    }
}
