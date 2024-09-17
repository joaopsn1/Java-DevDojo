package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        // \d = Todos os dígitos;
        // \D = Tudo que não for dígito;
        // \s = Todos os espaços em branco \t \n \f \r;
        // \S = Todos os caracteres excluindo os brancos;
        // \w = Tudo que for de a-z A-Z, dígitos, _;
        // \W = Tudo que não for incluso no \w;
        // []
        String regex = "\\w";
//        String texto = "abaaba";
        String texto2 = "cafeBABE";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  " + texto2);
        System.out.println("Índice: 0123456789");
        System.out.println("Regex " + regex);
        System.out.println("Posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
