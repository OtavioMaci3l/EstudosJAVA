package estudandojava.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int age;
    private double[] salario;
    private double media;

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
        media();
    }

    public void media() {
        if (salario == null) { //colocar as exeções no inicio do código é uma boa prática já que assim já no inicio do código verifica se vai dar alguma coisa de errado
            System.out.println("\nsalario nao informado");
            return;
        }
        for (double x : this.salario) {
            media += x;
        }
        media = media / 3;
        System.out.println("\nMedia dos tres salarios: " + media);
    }

    //setters, atribui um valor ao atributo
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    //getters, retorna o valor do atributo
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double[] getSalario() {
        return salario;
    }
    public double getMedia() {
        return media;
    }
}
