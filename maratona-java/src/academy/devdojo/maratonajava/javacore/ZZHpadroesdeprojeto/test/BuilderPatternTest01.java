package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder
                .builder()
                .firstName("João Pedro")
                .lastName("de Souza Nunes")
                .username("ViradoNoJiraya")
                .email("jp.souza.nunes@outlook.com.br")
                .build();
        System.out.println(build);
    }
}
