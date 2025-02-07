package estudandojava.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
    //MUITOS PARA UM
    private String nome;
    private Professor[] professores;

    public void imprime(){
        System.out.println(this.nome);
        if(professores == null) return;
        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }
}
