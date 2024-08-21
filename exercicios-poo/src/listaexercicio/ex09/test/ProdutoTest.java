package listaexercicio.ex09.test;

import listaexercicio.ex09.dominio.Celular;
import listaexercicio.ex09.dominio.Computador;
import listaexercicio.ex09.dominio.Produto;

public class ProdutoTest {
    public static void main(String[] args) {
        Produto celular = new Celular("Iphone 14", 6000, 4);
        System.out.println(celular.getNome());
        System.out.printf("R$ %.2f\n", celular.getPreco());
        celular.valorTotalEstoque();
        celular.verificaEstoque();
        System.out.println("-------------------------");

        Produto computador = new Computador("MacBook", 12000, 0);
        System.out.println(computador.getNome());
        System.out.printf("R$ %.2f\n", computador.getPreco());
        computador.valorTotalEstoque();
        computador.verificaEstoque();
    }
}
