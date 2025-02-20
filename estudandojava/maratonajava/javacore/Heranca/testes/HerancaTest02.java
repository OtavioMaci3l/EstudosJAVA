package estudandojava.maratonajava.javacore.Heranca.testes;

import estudandojava.maratonajava.javacore.Heranca.dominio.Funcionario;

public class HerancaTest02 {

    // Ordem de execução da Classe com HERANÇA
    // 0 - Bloco de inicialização STATIC da super Classe é executado quando a JVM executar a Class pai // na real tudo que é static é inicializado primeiro, poor isso que dentro de metodos, ou o bloco de inicialização, statics não se pode ultilizar atributos que não sejam statics, porque ainda não foram inicializados //e podemos chamar metodos estaticos dentro do bloco de inicialização statico, podendo fazer um algoritmo que seja garantido a execução de determinado código antes de tudo
    // 1 - Bloco de inicialização STATIC da sub Classe é executado quando a JVM executar a Class filha
    //
    // 2 - Alocado espaço em memória para o objeto da super classe
    // 3 - Cada atributo da super classe é criado e inicializado com valores defalt ou que foram passados
    // 4 - Bloco de inicialização da super classe é executado na ordem que que foram escritos
    // 5 - Contrutor da super classe é executado é executado
    //
    // 6 - Alocado espaço em memória para o objeto da sub clase
    // 7 - Cada atributo da sub classe é criado e inicializado com valores defalt ou que foram passados
    // 8 - Bloco de inicialização da sub classe é executado na ordem que que foram escritos
    // 9 - Contrutor da sub classe é executado é executado


    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("capivara");
    }
}
