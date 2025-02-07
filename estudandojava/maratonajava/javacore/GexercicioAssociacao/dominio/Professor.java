package estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Professor {
    //atributos
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    //construtores
    public Professor() {
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    //imprimir
    public void imprimir() {
        if (this.nome != null) {
            System.out.println("Nome             : " + this.nome);
        }
        if (this.especialidade != null) {
            System.out.println("Especialidade    : " + this.especialidade);
        }
        if (this.seminarios != null) {
            int i = 0;
            System.out.print("Seminarios       : ");
            for (Seminario seminario : this.seminarios) {
                i++;
                if (i > 1) {
                    System.out.println("                   " + seminario.getNome());
                } else {
                    System.out.println(seminario.getNome());
                }
            }
        }

        System.out.println("\n");
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }
}
