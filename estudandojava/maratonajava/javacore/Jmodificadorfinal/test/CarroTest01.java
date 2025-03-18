package estudandojava.maratonajava.javacore.Jmodificadorfinal.test;

import estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrariadaridoasdonadianiostacio;

public class CarroTest01 {
    public static void main(String[] args) {

        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE); // para chamar uma variavel const é mais coerente que use o classe em si, no caso, Carro, ao invez do objeto criado, no caso, carro
        carro.COMPRADOR.setNome("cledosvaldo");
        System.out.println(carro.COMPRADOR);

        Ferrariadaridoasdonadianiostacio ferrariadaridoasdonadianiostacio = new Ferrariadaridoasdonadianiostacio();

        ferrariadaridoasdonadianiostacio.setNome("cledosvaldoniense");
        ferrariadaridoasdonadianiostacio.imprime();
    }
}