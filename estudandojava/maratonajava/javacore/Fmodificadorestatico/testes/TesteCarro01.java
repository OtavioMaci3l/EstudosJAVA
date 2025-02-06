package estudandojava.maratonajava.javacore.Fmodificadorestatico.testes;

import estudandojava.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class TesteCarro01 {
    public static void main(String[] args) {

        Carro.setVelocidadeLimite(180); //isso faz sentido já que está alterando diretamente na Classe, no molde em que o objeto foi derivado

        Carro c1 = new Carro("Jhanburugandus", 999.99);
        Carro c2 = new Carro("WMB", 500.00);
        Carro c3 = new Carro("Jhanburugandus", 360.00);

//        c1.VelocidadeLimite=180; //isso da pra fazer, porem, logicamente, não faz sentido

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();
    }
}
