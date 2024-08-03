package test;

import dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.setTitularConta("João Pedro");
        contaBancaria.setNumeroContaCorrente(123456);
        contaBancaria.setSaldoContaCorrente(17500);
        contaBancaria.setNumeroPoupanca(142536);
        contaBancaria.setSaldoPoupanca(10000);
        contaBancaria.setSalario(5430);

        contaBancaria.imprimeDados();
        contaBancaria.depositoSalarioContaCorrente();
        contaBancaria.rendimentoPoupancaAnual();
    }
}
