package estudandojava.maratonajava.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    //ATRIBUTO COM MODIFICADOR STATIC, ele é um valor universal que não se refere ao objeto criado, mas sim a classe em si, o molde que criou o onjeto, ou seja, ao alterar um atributo static todos os objetos criados a partir dessa calasse serão alterados.
    //O modificador static faz com que o atributo seja relacionado a classe e não ao objeto criado.
    //Alterar o atributo static altera diretamente a classe, o molde do objeto, o que faz com que todos os objetos derivados dessa classe, molde, sejam alterados
    //Como se todos os objetos derivados da classe fossem um quadrado com os atributos e metodos dentro, porem ao lado desse quadrado tem outro quadrado contendo tudo que for STATIC, e todos os objetos tem isso, enquanto o quadrado do objeto será diferente em cada objeto podendo ser alterado sem modificar os outro objetos, o quadrado STATIC será indentico para todos os objetos, e se alterado, irá alterar todos os objetos derivados da classe
    public static double VelocidadeLimite = 250;

    //METODO COM MODIFICADOR STATIC //mesma lógica do atributo static
    //dessa forma o GET vai auterar o atributo static, ou seja, ira auterar diretamente a classe, o molde, dessa forma alterando essa atributo em todos objetos derivados
    //dentro de metodos statics só podem ser usados coisas statics, como na explicação da linha 10, em que a parte static do código é como se fosse um quadrado separado, porem o contrário é possivel, ultilizar valores statics no quadrado o objeto derivado
    public static void setVelocidadeLimite(double velocidadeLimite){
//        this.VelocidadeLimite = velocidadeLimite; //o this. se refere ao objeto especifico derivado da Classe, e como existe a possibilidade dessa instancia não existir, já que é possivel ultilizar mesmo sem ter cirado nenhum objeto derivado, não é possivel ultilizar o this. já que ele se referencia a instancia, ao objeto derivado e não a classe em si
        Carro.VelocidadeLimite = velocidadeLimite;  //então para fazer isso temos que colocar o nome da própria Classe já que assim estamos nos referindo a calsse e não a um objeto derivado
    }

    public static double getVelocidadeLimite(){
        return Carro.VelocidadeLimite;
    }


    //construtor
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //metodo para imprimir o valor de todos os atributos
    public void imprimir(){
        System.out.println("----------------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade máxima: " + this.velocidadeMaxima );
//        System.out.println("Velocidade limite: " + this.VelocidadeLimite); //fazer isso não faz sentido, porque como o atributo static se refere ao proprio molde, classe, chamar o atributo pelo this. estaria chamando o atributo naquele objeto especifico, sendo que o atributo é universal
        System.out.println("Velocidade limite: " + Carro.VelocidadeLimite);  //dessa forma faz sentido, pois esta se referindo a varivel static na classe, molde, em si, não a um objeto especifico derivado da classe
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

//    public void setVelocidadeLimite(double velocidadeLimite) {
//        this.VelocidadeLimite = velocidadeLimite; //logo isso tambem não faz sentido, pelo mesmo motivo do System.out.println();
//    }

    //getters
    public String getNome() {
        return nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
}
