package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "João"; //String constant pool
        String nome2 = "João";
        nome = nome.concat(" Pedro");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("João"); //1 variável de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3.intern());
    }
}
