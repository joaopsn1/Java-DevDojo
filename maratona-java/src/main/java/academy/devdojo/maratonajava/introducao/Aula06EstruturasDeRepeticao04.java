package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do carro: R$ ");
        double valorCarro = scanner.nextDouble();
        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.printf("Parcela: " + parcela + " R$ %.2f\n", valorParcela);
        }
    }
}
