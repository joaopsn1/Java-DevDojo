package test.banco;

import dominio.banco.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();

        contaBancaria.init("João Pedro", 123456, 17500, 142536, 10000, 5430);

        contaBancaria.imprimeDados();
        contaBancaria.depositoSalarioContaCorrente();
        contaBancaria.rendimentoPoupancaAnual();
    }
}
