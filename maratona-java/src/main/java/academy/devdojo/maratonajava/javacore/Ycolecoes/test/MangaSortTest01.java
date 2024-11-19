package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Berserk", 9.50));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.90));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(4L, "Pokemon", 3.20));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99));
        mangas.add(new Manga(7L, "One Piece", 10.80));
        mangas.add(new Manga(6L, "Naruto", 5.65));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------------------------------------------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("----------------------------------------------------------");
//        Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
