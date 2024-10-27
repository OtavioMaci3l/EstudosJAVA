package estudandojava.maratonajava.javacore.Aintroducaoclasses.test;

import estudandojava.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "kami";
        professor.idade = 150;
        professor.sexo = 'M';
        System.out.println("\nNome: "+professor.nome + "\nIdade: " + professor.idade + "\nSexo: " + professor.sexo);
    }
}
