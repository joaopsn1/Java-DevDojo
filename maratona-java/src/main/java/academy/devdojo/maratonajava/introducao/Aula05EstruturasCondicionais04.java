package academy.devdojo.maratonajava.introducao;

/*
Quanto irei pagar de imposto com base no meu salario anual
 */

import java.util.Scanner;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu salário anual: R$ ");
        double salarioAnual = scanner.nextDouble();
        double taxaImposto;
        double valorTotalImposto;

        if (salarioAnual <= 34712) {
            taxaImposto = 9.7;
            valorTotalImposto = salarioAnual * (taxaImposto / 100);
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            taxaImposto = 37.35;
            valorTotalImposto = salarioAnual * (taxaImposto / 100);
        } else {
            taxaImposto = 49.50;
            valorTotalImposto = salarioAnual * (taxaImposto / 100);
        }
        System.out.printf("Valor do imposto à pagar: R$ %.2f\n", valorTotalImposto);
    }
}
