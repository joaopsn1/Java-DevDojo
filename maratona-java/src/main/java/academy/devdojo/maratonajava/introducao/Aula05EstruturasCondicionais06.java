package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    // Utilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
    // Considere 1 como domingo
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        int diaSemana = scanner.nextInt();
        switch (diaSemana){
            case 1:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Opção Inválida");
                break;
        }
    }
}
