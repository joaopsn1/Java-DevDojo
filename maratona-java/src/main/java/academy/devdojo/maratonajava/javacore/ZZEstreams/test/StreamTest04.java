package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devdojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harrison");
        List<String> students = List.of("Edipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devdojo.add(graphicDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people : devdojo) {
            for (String person : people) {
                System.out.println(person);
            }
        }
        System.out.println("--------");
        devdojo.stream()
                .flatMap(Collection::stream) //Serve para retirar atributos ou coleção de dentro de outro lugar, aninhado;
                .forEach(System.out::println);
    }
}