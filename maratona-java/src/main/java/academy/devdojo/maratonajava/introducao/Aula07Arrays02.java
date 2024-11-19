package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char '\U0000' ' '
        // boolean false
        // String null
        String[] nomes = new String[4];
        nomes[0] = "Luffy";
        nomes[1] = "Goku";
        nomes[2] = "Naruto";
        nomes[3] = "Eren";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
