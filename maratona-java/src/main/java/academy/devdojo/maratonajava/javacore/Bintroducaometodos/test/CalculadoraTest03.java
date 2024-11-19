package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divisao(20, 200);
        System.out.println(result);
        System.out.println(calculadora.divisao02(20, 0));
        System.out.println("------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86, 5);
    }
}
