package estudandojava.maratonajava.javacore.GexercicioAssociacao.dominio;

public class Local {
    private String cidade;
    private String bairro;
    private String rua;
    private long numero;

    //construtores
    public Local(String cidade, String bairro, String rua, long numero) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public Local(String cidade, String bairro, String rua) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
    }

    public Local(String cidade, String bairro) {
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Local(String cidade) {
        this.cidade = cidade;
    }

    public Local() {
    }

    //imprimir
    public void imprimir() {
        if (this.cidade != null) {
            System.out.println("Cidade  : " + this.cidade);
        }
        if (this.bairro != null) {
            System.out.println("Bairro  : " + this.bairro);
        }
        if (this.rua != null) {
            System.out.println("Rua     : " + this.rua);
        }
        System.out.println("Numero  : " + this.numero);
    }

    //setters
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    //getters
    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public long getNumero() {
        return numero;
    }
}
