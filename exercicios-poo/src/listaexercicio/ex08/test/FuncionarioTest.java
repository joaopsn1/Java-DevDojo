package listaexercicio.ex08.test;

import listaexercicio.ex08.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João Pedro", 22, "Engenheiro de Software Sênior", 15000);
        funcionario.INSS();
        System.out.println("-------------------------------------------------------------------");
        funcionario.FGTS();
        System.out.println("-------------------------------------------------------------------");
        funcionario.dadosFuncionario();
        funcionario.salarioLiquido();
    }
}
