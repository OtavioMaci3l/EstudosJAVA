package estudandojava.maratonajava.javacore.Aintroducaoclasses.test;

import estudandojava.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;
import estudandojava.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

//obs: essas variaveis carro1 e carro2 são variaveis de referencia, ou seja, referenciam a um espaço na memória que serio o objeto
//variaveis de referencia podem referenciar outros objetos

public class CarroTestExercicio {
    public static void main(String[] args) {
        //Objeto 1
        Carro carro = new Carro();
        carro.nome = "Ferrari";
        carro.modelo = "M89U7";
        carro.ano = 1970;
        System.out.println("Carro 1" + "\nNome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);

        //Separa
        System.out.println("\n---------------------------");

        //Objeto 2
        Carro carro2 = new Carro();
        carro2.nome = "Maionese";
        carro2.modelo = "S3R4Z4";
        carro2.ano = 2021;
        System.out.println("Carro 2" + "\nNome: " + carro2.nome + "\nModelo: " + carro2.modelo + "\nAno: " + carro2.ano);

        //fazer uma variavel de referencia mudadar a referencia para outro objeto
        System.out.println("\n----------------------------");

        //agora o carro faz referencia ao mesmo objeto que o carro 2 está fazendo
        //fazendo isso o objeto que a variavel de referencia estava fazendo referencia é perdido e deixa de ser acessavel
        carro = carro2;
        //porem só pode fazer isso com variaveis que referenciam a objetos com o mesmo molde
        //então não pode fazer o carro referenciar ao professor, já que são moldes diferentess
        //Professor professor = new Professor();
        //carro = professor;

        System.out.println("Carro 1 referenciando ao objeto Carro2" + "\nNome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);
    }
}
