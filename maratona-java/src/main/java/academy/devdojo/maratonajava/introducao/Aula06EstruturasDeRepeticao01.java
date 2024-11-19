package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contador = 0;
        System.out.println("While");
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }
        contador = 0;
        System.out.println();
        System.out.println("Do While");
        do {
            System.out.println(contador);
            contador += 5;
        } while (contador <= 10);

        System.out.println();
        System.out.println("For");
        for (int i = 0; i <= 7; i++) {
            System.out.println(i);
        }
    }
}
