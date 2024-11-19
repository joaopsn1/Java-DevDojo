package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);
        System.out.println("---------------------");

        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(1L, "Berserk", 9.50, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.90, 5));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(4L, "Pokemon", 3.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99, 0));
        for (Manga manga : mangas) { //decendingSet é para imprimir a lista na ordem decrescente.
            System.out.println(manga);
        }

        Manga yuyu = new Manga(1L, "Yuyu Hakusho", 3.2, 5);

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println("------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));

        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst()); // retorna e retira o primeiro elemento da lista
        System.out.println(mangas.size());
        System.out.println(mangas.pollLast()); // retorna e retira o último elemento da lista
        System.out.println(mangas.size());
    }
}
