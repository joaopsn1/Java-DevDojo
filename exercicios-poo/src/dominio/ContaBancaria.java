package dominio;

public class ContaBancaria {
    private String titularConta;
    private int numeroContaCorrente;
    private double saldoContaCorrente;
    private int numeroPoupanca;
    private double saldoPoupanca;
    private double salario;

    public void imprimeDados() {
        System.out.println("Dados da Conta Bancária");
        System.out.println("Titular: " + this.titularConta);
        System.out.println("Conta Corrente: " + this.numeroContaCorrente);
        System.out.printf("Saldo Atual: R$ %.2f\n", this.saldoContaCorrente);
        System.out.println("Conta Poupança: " + this.numeroPoupanca);
        System.out.printf("Saldo Atual: R$ %.2f\n", this.saldoPoupanca);
    }

    public void depositoSalarioContaCorrente() {
        System.out.println("--------------------------------------");
        System.out.printf("Salario Mensal: R$ %.2f\n", this.salario);
        double parcelaPoupanca = 500;
        System.out.printf("Valor retirado para depósito na Poupança: R$ %.2f\n", parcelaPoupanca);
        double saldoFinalContaCorrente = saldoContaCorrente + salario - parcelaPoupanca;
        System.out.printf("Saldo Conta Corrente: R$ %.2f\n", saldoFinalContaCorrente);
    }

    public void rendimentoPoupancaAnual() {
        System.out.println("--------------------------------------");
        System.out.println("Poupança Anual com depósito de R$ 500,00 por mês");
        double rendimentoMensal = 0;
        for (int i = 1; i <= 12; i++) {
            double percentualRendimento = 8;
            rendimentoMensal = saldoPoupanca * (percentualRendimento / 100) / 12;
            saldoPoupanca += rendimentoMensal;
            saldoPoupanca += 500;
        }
        System.out.printf("Saldo Final Poupança Anual: R$ %.2f\n", saldoPoupanca);
    }

    public int getNumeroPoupanca() {
        return numeroPoupanca;
    }

    public void setNumeroPoupanca(int numeroPoupanca) {
        this.numeroPoupanca = numeroPoupanca;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public int getNumeroContaCorrente() {
        return numeroContaCorrente;
    }

    public void setNumeroContaCorrente(int numeroContaCorrente) {
        this.numeroContaCorrente = numeroContaCorrente;
    }

    public double getSaldoContaCorrente() {
        return saldoContaCorrente;
    }

    public void setSaldoContaCorrente(double saldoContaCorrente) {
        this.saldoContaCorrente = saldoContaCorrente;
    }
}
