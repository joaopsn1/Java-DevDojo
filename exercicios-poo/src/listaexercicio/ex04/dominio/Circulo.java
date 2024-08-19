package listaexercicio.ex04.dominio;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area() {
        System.out.print("Área: ");
        return Math.PI * Math.pow(this.getRaio(), 2);
    }

    public double perimetro() {
        System.out.printf("Perímetro: ");
        return 2 * Math.PI * this.getRaio();
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
