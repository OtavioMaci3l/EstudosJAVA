package estudandojava.maratonajava.javacore.Gassociacao.testes;

import java.util.Scanner;

public class LeituraDoTeclado02 {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);

        System.out.println("----- O GRANDE SOFTWARE DE RESPONDER PERGUNTAS -----");
        System.out.println("--- digite sua pergunta e responderei sim ou não ---\n");

        while (true){
            String pergunta = ipt.nextLine();
            if (pergunta.charAt(0) == ' ') {
                System.out.println("Sim");
            } else if (pergunta.charAt(0) != ' ') {
                System.out.println("Não");
            } else {
                System.out.println("\nSaindo...");
                break;
            }
        }

    }
}
