package listaexercicio.ex06.test;

import listaexercicio.ex06.dominio.Retangulo;

public class RetanguloTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(10.8, 5.5);
        retangulo.area();
        retangulo.perimetro();
    }
}
