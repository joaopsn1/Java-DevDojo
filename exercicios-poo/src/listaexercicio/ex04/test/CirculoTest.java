package listaexercicio.ex04.test;

import listaexercicio.ex04.dominio.Circulo;

public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println(circulo.area());
        System.out.println("---------------------------");
        System.out.println(circulo.perimetro());
    }
}
