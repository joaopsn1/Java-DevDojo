package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "João Pedro";

    static class Nested { //utilizar o static é como se fosse uma outra classe de alto nível, como se estivesse fora da OuterClasses
        private String lastName = "de Souza Nunes";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName); //por name não ser estático, deve acessar dessa forma;
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
