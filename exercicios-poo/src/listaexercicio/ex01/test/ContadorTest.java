package listaexercicio.ex01.test;

import listaexercicio.ex01.dominio.Contador;

public class ContadorTest {
    public static void main(String[] args) {
        Contador contador = new Contador();

        contador.imprime();
        System.out.println("-----------------");
        contador.incrementarItens(2);
        contador.imprime();
        System.out.println("-----------------");
        contador.incrementarItens(5);
        contador.imprime();
        System.out.println("-----------------");
        contador.zerarItens();
        contador.imprime();
    }
}
