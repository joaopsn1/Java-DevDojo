package listaexercicio.ex06.dominio;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void area() {
        double area = this.altura * this.largura;
        System.out.printf("Área: %.2f\n", area);
    }

    public void perimetro() {
        double perimetro = 2 * (this.largura + this.altura);
        System.out.printf("Perímetro: %.2f\n", perimetro);
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
