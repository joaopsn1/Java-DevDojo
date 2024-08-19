package listaexercicio.ex05.dominio;

public class ContaBancaria extends Pessoa {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String nome, int idade, String numeroConta, double saldo) {
        super(nome, idade);
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void abrirConta() {
        System.out.println("Nome Titular: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        if (idade >= 18) {
            this.numeroConta = numeroConta;
            System.out.println("Número Conta: " + numeroConta);
            return;
        }
        System.out.println("Idade insuficiente para abrir conta! Necessário ser maior de 18 anos.");
    }

    public void saldoConta() {
        if (idade >= 18) {
            System.out.printf("Saldo da Conta: R$ %.2f\n", saldo);
            return;
        }
    }

    public void deposito(double deposito) {
        if (idade >= 18) {
            System.out.println("Depositando...");
            System.out.printf("Depósito: R$ %.2f\n", deposito);
            this.saldo += deposito;
        }
    }

    public void saque(double saque) {
        if (idade >= 18) {
            System.out.println("Sacando...");
            System.out.printf("Saque: R$ %.2f\n", saque);
            this.saldo -= saque;
        }
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
