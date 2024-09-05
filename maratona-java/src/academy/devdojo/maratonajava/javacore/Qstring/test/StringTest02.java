package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "        Luffy         ";
        String numero = "012345";
        System.out.println(nome.charAt(0)); //Posição dos caracteres
        System.out.println(nome.length()); //Tamanho da String
        System.out.println(nome.replace("f", "l")); //Trocar as letras
        System.out.println(nome.toLowerCase()); //Transformar tudo em minúsculo
        System.out.println(nome.toUpperCase()); //Transformar tudo em maiúsculo
        System.out.println(numero.length());
        System.out.println(numero.substring(3));
        System.out.println(nome.trim()); //Remove os valores em branco do começo e do fim da String
    }
}
