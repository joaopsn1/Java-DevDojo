package listaexercicio.ex02.test;

import listaexercicio.ex02.dominio.Ponto2D;

public class Ponto2DTest {
    public static void main(String[] args) {
        Ponto2D p1 = new Ponto2D();
        p1.mostrarCoordenadas();
        System.out.println("-------------------------");
        Ponto2D p2 = new Ponto2D(5,2);
        p2.mostrarCoordenadas();
    }
}
