package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "João Pedro";
        nome.concat(" Dev");
        nome.substring(0, 3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("João Pedro");
        sb.append(" Dev").append(" Senior");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
