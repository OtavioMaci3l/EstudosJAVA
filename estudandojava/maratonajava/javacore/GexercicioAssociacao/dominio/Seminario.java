package estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Seminario {
    //atributos
    private String nome;
    //seminario tem um local
    private Local local;
    //seminario tem varios alunos
    private Aluno[] alunos;

    //construtores


    public Seminario(Local local) {
        this.local = local;
    }

    public Seminario(Local local, String nome) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(Local local, String nome, Aluno[] alunos) {
        this.nome = nome;
        this.local = local;
        this.alunos = alunos;
    }

    //imprimir
    public void imprimir() {
        if (this.nome != null) {
            System.out.println("Nome    : " + this.nome);
        }
        if (this.local != null) {
            this.local.imprimir();
        }else{
            System.out.println("\n### Local do seminário não especifícado ###\n");
        }
        if (this.alunos != null) {
            int i = 0;
            System.out.print("Alunos  : ");
            for (Aluno aluno : alunos) {
                i++;
                if (i > 1) {
                    System.out.println("          " + aluno.getNome());
                } else {
                    System.out.println(aluno.getNome());
                }
            }

        }

        System.out.println("\n");
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Local getLocal() {
        return local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }
}
