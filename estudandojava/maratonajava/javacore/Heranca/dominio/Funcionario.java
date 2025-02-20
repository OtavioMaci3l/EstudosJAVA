package estudandojava.maratonajava.javacore.Heranca.dominio;

// isso é uma herança, porem herança não é algo tão interessante porque qualquer alteração que fizer na classe principal vai ter que se preocupar com as classes que extend essa classe principal
// 2 possibilidades para o uso:
// - Extender as funcionalidades de uma Classe
// - Polimorfismo

// Associação : tem um  // aclopa um pouco menos // tem um siginifica que o objeto está fazendo referencia a outro objeto
// Herança    : é um    // aclopa muito o código // é um significa que o objeto está herdando, extendendo um outro objeto

import java.sql.SQLOutput;

// não existe herança multipla, aparentemente isso vai mudar quando chegar no conteúdo de interface
//           funcionario  é uma  pessoa
public class Funcionario extends Pessoa /*, Aluno */ {

    private double salario;

    static{
        System.out.println("dentro do bloco de inicialização static FUNCIONARIO");
    }
    {
        System.out.println("dentro do bloco de inicialização1 FUNCIONARIO");
    }
    {
        System.out.println("dentro do bloco de inicialização2 FUNCIONARIO");
    }

    public Funcionario(String nome){
        // pela lógica, o funcionário é uma pessoa, uma pessoa obrigatóriamente precisa possuir um nome, logo teremos e "importar" o construtor da classe mãe para, para isso usamos o super()
        super(nome); //basicamente funciona da mesma forma que o this(), porem no caso do super(), ele vai procurar na classe mãe qual contrutor se encaixa com os argumentos passados
        System.out.println("dentro do construtor funcionario");
    }

    // ctrl + o
    public Funcionario() {
        super();
    }

    public Funcionario(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override //para indicar que o metodo está sendo sobre escrito
    public void imprimir() { // ao escrever o metodo da mesma forma que foi escrito na classe que está servindo como herança, sobreescreve o metodo fazendo com que agora o metodo execute isso ao invez do que foi herdado
        super.imprimir(); // o super. vai fazer com que o metodo seja executado da forma que foi escrito na classe que está servindo como herança, da forma com que ele foi herdado
        System.out.println(this.salario);
    }

    public void relatorio() {
        System.out.println("eu " + this.nome + " recebi o salário de " + this.salario); //como não tem acesso direto ao atributo, por ele ser privado, então se usa protected no modificado de acesso do atributo desejado, pois dessa forma todas as subclasses, classes que herdaram da classe, terão acesso a esse atributo
        //porem o protected dará tanto o acesso a todas as subclasses extendidas dessa classe qaunto a todas as classes dentro do pacote
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

}
