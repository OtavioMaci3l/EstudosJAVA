package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int age;
    public double[] salario;

    public void imprimir() {
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        if (salario == null) { //sempre pense no que pode da errado e impessa a execuxão se algo for dar errado
            System.out.println("\nsalario nao informado");
            return;
        }
        System.out.print("Tres salarios: ");
        for (double x : this.salario) {
            System.out.print(x);
        }
    }

    public void media() {
        if (salario == null) { //colocar as exeções no inicio do código é uma boa prática já que assim já no inicio do código verifica se vai dar alguma coisa de errado
            System.out.println("\nsalario nao informado");
            return;
        }
        double media = 0;
        for (double x : this.salario) {
            media += x;
        }
        media = media / 3;
        System.out.println("\nMedia dos tres salarios: " + media);
    }
}
