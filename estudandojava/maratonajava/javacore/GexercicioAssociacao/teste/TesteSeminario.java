package estudandojava.maratonajava.javacore.GexercicioAssociacao.teste;

import estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio.Aluno;
import estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio.Local;
import estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio.Professor;
import estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio.Seminario;

public class TesteSeminario {

    /// Crie um sistema que gerencie seminários
    ///
    /// o sistema deverá cadastrar seminários, estudantes, professores e o local onde será realizado
    ///
    ///  - Um aluno poderá estar em apenas um seminário
    ///  - Um seminário poderá ter nenhum ou vários alunos
    ///  - Um professor poderá ministrar vários seminários
    ///  - Um seminário deverá ter um local

    public static void main(String[] args) {
        // objetos

        //local
        Local local1 = new Local("Capivalandia", "Capabo Segundo", "CapivareitiunsBone", 01);
        Local local2 = new Local("Guaxinilopoles", "Guaxinita", "Guataburgo", 498);

        //seminarios
        Seminario seminario1 = new Seminario(local1, "Capivaras do Zodiaco");
        Seminario seminario2 = new Seminario(local2,"Hunting Capybaras");

        //alunos
        Aluno aluno1 = new Aluno("Cledosvaldo", 15, seminario1);
        Aluno aluno2 = new Aluno("Yakuza", 16, seminario1);
        Aluno aluno3 = new Aluno("Mautazir", 14, seminario2);
        Aluno aluno4 = new Aluno("Tungtenio", 15, seminario2);

        //professores
        Professor professor1 = new Professor("Fulano", "Fazer café", new Seminario[]{seminario1});
        Professor professor2 = new Professor("Claudiano", "Fazer circulos perfeitos", new Seminario[]{seminario1, seminario2});

        //setts
        seminario1.setAlunos(new Aluno[]{aluno1, aluno2});
        seminario2.setAlunos(new Aluno[]{aluno3, aluno4});

        //imprimir
        System.out.println("----- Seminarios -----\n");
        seminario1.imprimir();
        seminario2.imprimir();

        System.out.println("------- Alunos -------\n");
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
        aluno4.imprimir();

        System.out.println("---- Professores -----\n");
        professor1.imprimir();
        professor2.imprimir();

    }
}
