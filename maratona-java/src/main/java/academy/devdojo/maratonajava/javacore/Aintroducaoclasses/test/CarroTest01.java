package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Touring";
        carro1.ano = 2021;
        System.out.println("Nome: " + carro1.nome + " - Modelo: " + carro1.modelo + " - Ano: " + carro1.ano);

        Carro carro2 = new Carro();
        carro2.nome = "Jetta";
        carro2.modelo = "GLI";
        carro2.ano = 2019;
        System.out.println("Nome: " + carro2.nome + " - Modelo: " + carro2.modelo + " - Ano: " + carro2.ano);
    }
}
