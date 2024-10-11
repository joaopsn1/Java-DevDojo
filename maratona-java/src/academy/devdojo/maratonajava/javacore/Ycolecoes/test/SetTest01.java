package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Berserk", 9.50, 5));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.90, 5));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20, 2));
        mangas.add(new Manga(4L, "Pokemon", 3.20, 0));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99, 0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
