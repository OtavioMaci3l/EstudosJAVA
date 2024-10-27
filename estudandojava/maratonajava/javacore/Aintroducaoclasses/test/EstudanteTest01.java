package estudandojava.maratonajava.javacore.Aintroducaoclasses.test;
import estudandojava.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

//nao confunda Estudante e estudante...

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //variavel de referencia que faz referencia a um objeto do tipo Estudante

        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        System.out.println(estudante);
    }
}
