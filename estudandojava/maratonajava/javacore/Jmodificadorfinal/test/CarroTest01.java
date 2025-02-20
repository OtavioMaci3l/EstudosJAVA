package estudandojava.maratonajava.javacore.Jmodificadorfinal.test;

import estudandojava.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE); // para chamar uma variavel const é mais coerente que use o classe em si, no caso, Carro, ao invez do objeto criado, no caso, carro
    }
}
