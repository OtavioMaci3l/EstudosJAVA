package estudandojava.maratonajava.introducao;

/**
* Exercício simples:<br>
* Crie variaveis para os campos descritos abaico entre < > e imprima a senguinte mensagem:<br>
* Eu < nome >, morando no endereco < endereco >, confirmo que recebi o salario de < salario >, na data < data >*/

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome="Tartuguito";
        String ende="Rua Tal Bairro Fulano";
        double sal=10000.00;
        String data="10/09/2027";
        String relatorio="Eu "+nome+", morando no endereco "+ende+", confirmo que recebi o salario de "+sal+", na data "+data;
        System.out.println(relatorio);
    }
}
