package listaexercicio.ex05.test;

import listaexercicio.ex05.dominio.ContaBancaria;

public class ContaBancariaTest {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("João Pedro", 22, "52.547-4", 5000);

        contaBancaria.abrirConta();
        contaBancaria.saldoConta();
        contaBancaria.deposito(500);
        contaBancaria.saldoConta();
        contaBancaria.saque(2500);
        contaBancaria.saldoConta();
    }
}
