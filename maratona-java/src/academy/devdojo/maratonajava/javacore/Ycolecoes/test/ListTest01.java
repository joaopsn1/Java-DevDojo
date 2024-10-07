package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("João");
        nomes.add("Pedro");
        nomes2.add("Souza");
        nomes2.add("Nunes");
//        System.out.println(nomes.remove("Joao"));
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("---------------");
        int size = nomes.size();
        for (int i = 0; i < size; i++) {
            System.out.println(nomes.get(i));
        }
        System.out.println("---------------");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        for (Integer numero : numeros) {
            System.out.println(numero);
        }
    }
}
