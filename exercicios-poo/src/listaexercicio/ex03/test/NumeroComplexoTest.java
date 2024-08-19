package listaexercicio.ex03.test;

import listaexercicio.ex03.dominio.NumeroComplexo;

public class NumeroComplexoTest {
    public static void main(String[] args) {
        NumeroComplexo numero1 = new NumeroComplexo(3, 2);
        NumeroComplexo numero2 = new NumeroComplexo(1, 7);

        NumeroComplexo soma = numero1.somar(numero2);
        NumeroComplexo subtrair = numero1.subtrair(numero2);
        NumeroComplexo multiplicar = numero1.multiplicar(numero2);
        NumeroComplexo dividir = numero1.dividir(numero2);
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtrair);
        System.out.println("Multiplicação: " + multiplicar);
        System.out.println("Divisão: " + dividir);
    }
}
