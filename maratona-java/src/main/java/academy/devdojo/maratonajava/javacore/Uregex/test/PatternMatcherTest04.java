package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        // \d = Todos os dígitos;
        // \D = Tudo que não for dígito;
        // \s = Todos os espaços em branco \t \n \f \r;
        // \S = Todos os caracteres excluindo os brancos;
        // \w = Tudo que for de a-z A-Z, dígitos, _;
        // \W = Tudo que não for incluso no \w;
        // []
        // ? Zero ou uma
        // * zero ou mais
        // + uma ou mais
        // {n, m} de n até m
        // ()
        // | o(v|c)o ovo | oco
        // $ fim da linha
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String texto2 = "12 0x 0X 0xFFABC 0x10G 0x1";
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
