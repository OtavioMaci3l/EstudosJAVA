package estudandojava.maratonajava.javacore.Kenum.tests;

import estudandojava.maratonajava.javacore.Kenum.dominio.Cliente;
import estudandojava.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClenteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Cledosvaldo", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Cledosvaldienenses", TipoCliente.PESSOA_JURIDICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
    }
}
