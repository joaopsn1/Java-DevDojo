package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class Funcionario2 extends Pessoa {
    @Override
    public void imprime() {
        this.nome = "João";
    }
}
