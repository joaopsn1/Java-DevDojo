package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Berserk", 9.50));
        mangas.add(new Manga(5L, "Hellsing Ultimate", 19.90));
        mangas.add(new Manga(3L, "Attack on Titan", 11.20));
        mangas.add(new Manga(4L, "Pokemon", 3.20));
        mangas.add(new Manga(2L, "Dragon Ball", 2.99));
        mangas.add(new Manga(7L, "One Piece", 10.80));
        mangas.add(new Manga(6L, "Naruto", 5.65));

//        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Dragon Ball", 2.99);
        System.out.println(Collections.binarySearch(mangas, mangaToSearch, mangaByIdComparator));
    }
}
