package listaexercicio.ex03.dominio;

public class NumeroComplexo {
    private double parteReal;
    private double parteImaginaria;

    public NumeroComplexo(double numeroInteiro, double numeroFracionario) {
        this.parteReal = numeroInteiro;
        this.parteImaginaria = numeroFracionario;
    }

    public NumeroComplexo somar(NumeroComplexo outro) {
        return new NumeroComplexo(this.parteReal + outro.getParteReal(), this.parteImaginaria + outro.getParteImaginaria());
    }

    public NumeroComplexo subtrair(NumeroComplexo outro) {
        return new NumeroComplexo(this.parteReal - outro.getParteReal(),this.parteImaginaria - outro.getParteImaginaria()
        );
    }

    public NumeroComplexo multiplicar(NumeroComplexo outro) {
        double novaParteReal = this.parteReal * outro.getParteReal() - this.parteImaginaria * outro.getParteImaginaria();
        double novaParteImaginaria = this.parteReal * outro.getParteImaginaria() + this.parteImaginaria * outro.getParteReal();
        return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }

    public NumeroComplexo dividir(NumeroComplexo outro) {
        double divisor = outro.getParteReal() * outro.getParteReal() + outro.getParteImaginaria() * outro.getParteImaginaria();
        double novaParteReal = (this.parteReal * outro.getParteReal() + this.parteImaginaria * outro.getParteImaginaria()) / divisor;
        double novaParteImaginaria = (this.parteImaginaria * outro.getParteReal() - this.parteReal * outro.getParteImaginaria()) / divisor;
        return new NumeroComplexo(novaParteReal, novaParteImaginaria);
    }

    @Override
    public String toString() {
        return parteReal + " + " + parteImaginaria + "i";
    }

    public double getParteReal() {
        return parteReal;
    }

    public void setParteReal(double parteReal) {
        this.parteReal = parteReal;
    }

    public double getParteImaginaria() {
        return parteImaginaria;
    }

    public void setParteImaginaria(double parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }
}
