package estudandojava.maratonajava.javacore.Heranca.dominio;

public class Endereco {
    private String rua;
    private String cep;

    public void imprimir(){
        Pessoa p = new Pessoa();
        p.nome = "eita";
        System.out.println(p);
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public String getCep() {
        return cep;
    }
}
