package futebol.test;

import futebol.dominio.Clube;
import futebol.dominio.Estado;
import futebol.dominio.Jogador;

public class ClubeTest {
    public static void main(String[] args) {
        Estado estado = new Estado("São Paulo");
        Estado estado1 = new Estado("Rio de Janeiro");
        Jogador jogador = new Jogador("Lionel Messi", 37, 1.69, 67);
        Jogador jogador1 = new Jogador("Cristiano Ronaldo", 39, 1.85, 80);
        Jogador jogador2 = new Jogador("Neymar", 32, 1.75, 68);
        Jogador[] jogadores = {jogador, jogador1};
        Clube clube = new Clube("Corinthians", jogadores, estado);
        Clube clube1 = new Clube("Flamengo", estado1);
        jogador = new Jogador("Lionel Messi", 37, 1.69, 67, clube);
        jogador1 = new Jogador("Cristiano Ronaldo", 39, 1.85, 80, clube);

        clube.imprime();
        System.out.println("-----------------------------------");
        clube1.imprime();

        System.out.println("-----------------------------------");

        jogador.imprime();
        System.out.println("-----------------------------------");
        jogador1.imprime();
        System.out.println("-----------------------------------");
        jogador2.imprime();
    }
}
