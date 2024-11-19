package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.00;
        float salarioFloat = 2500.00F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 88;
        String nome = "João Pedro"; 

        System.out.println("A idade é: " + idade + " anos");
        System.out.println(falso);
        System.out.println("Char: " + caractere);
        System.out.println(salarioFloat);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome);
    }
}
