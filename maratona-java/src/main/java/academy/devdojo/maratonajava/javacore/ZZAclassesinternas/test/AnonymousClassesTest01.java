package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal walking");
    }
}

class Cachorro extends Animal {
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){ //classe anômina, uma subclasse de animal
            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
    }
}
