package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on Titan");
        mangas.add("Pokemon");
        mangas.add("Dragon Ball");
        mangas.add("One Piece");
        mangas.add("Naruto");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(54.32);
        dinheiros.add(88.40);

        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-----------------------");

        for (Double dinheiro : dinheiros) {
            System.out.println(dinheiro);
        }

        Manga manga = new Manga(null, null, 100);
    }
}
