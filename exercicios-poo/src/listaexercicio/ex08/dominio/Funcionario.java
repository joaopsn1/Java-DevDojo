package listaexercicio.ex08.dominio;

import listaexercicio.ex07.dominio.Pessoa;
import listaexercicio.ex08.repositorio.Descontos;

public class Funcionario extends Pessoa implements Descontos {
    private String cargo;
    private double salarioBruto;

    public Funcionario(String nome, int idade, String cargo, double salarioBruto) {
        super(nome, idade);
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }

    public void dadosFuncionario() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cargo: " + this.cargo);
    }

    public void salarioLiquido() {
        System.out.printf("Salário Bruto: R$ %.2f\n", this.salarioBruto);
        double descontoINSS = 0;
        double descontoFGTS = 0;
        double salarioLíquido = 0;
        if (this.salarioBruto <= 1045) {
            descontoINSS = descontoINSS(this.salarioBruto);
        } else if (this.salarioBruto > 1045 && this.salarioBruto <= 2089.60) {
            descontoINSS = descontoINSS(this.salarioBruto);
        } else if (this.salarioBruto > 2089.60 && this.salarioBruto <= 3134.4) {
            descontoINSS = descontoINSS(this.salarioBruto);
        } else if (this.salarioBruto > 3134.40 && this.salarioBruto <= 10000) {
            descontoINSS = descontoINSS(this.salarioBruto);
        } else {
            descontoINSS = descontoINSS(this.salarioBruto);
        }
        descontoFGTS = descontoFGTS(this.salarioBruto);
        salarioLíquido = this.salarioBruto - descontoINSS - descontoFGTS;
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioLíquido);
    }

    @Override
    public void INSS() {
        Descontos.super.INSS();
    }

    @Override
    public void FGTS() {
        Descontos.super.FGTS();
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
}
