package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;

public class OuterClassesTest02 {
    private String name = "Midorya";

    void print(final String param) { //também deve ser efetivamente final
        final String lastName = "Izuku"; //precisa ser final
        class LocalClass {
            public void printLocal() {
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("");
    }
}
