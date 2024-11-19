package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("João Pedro");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{2500, 3000, 5000});
        funcionario.imprime();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
