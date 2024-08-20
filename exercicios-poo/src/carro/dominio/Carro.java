package carro.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;
    public double consumo;
    public double tanque;
    public double distanciaViagem;
    public double valorGasolina;
    public double valorPedagio;
    public int quantidadePedagio;

    public void gastoDeCombustivel() {
        System.out.println("--------------------------------------------");
        double gastoCombustivel = distanciaViagem / consumo;
        System.out.printf("Litros de Combustível gasto na ida: %.2f\n", gastoCombustivel);
        tanque -= gastoCombustivel;
        System.out.printf("Litros de Combustível restantes: %.2f\n", tanque);
        if (tanque < 27.55) {
            System.out.println("É necessário abastecer o carro");
            tanque += gastoCombustivel;
        } else {
            System.out.println("Não é necessário abastecer o carro");
            return;
        }
        System.out.printf("Tanque cheio: %.2f\n", tanque);
    }

    public void gastoViagem() {
        System.out.println("--------------------------------------------");
        double valorTotalPedagio = valorPedagio * quantidadePedagio;
        System.out.printf("Valor Total Pedágio: R$ %.2f\n", valorTotalPedagio);
        double gastoCombustivel = distanciaViagem / consumo;
        double valorTotalGasolina = valorGasolina * gastoCombustivel;
        System.out.printf("Valor Total Combustível para a viagem de volta: R$ %.2f\n", valorTotalGasolina);
        System.out.printf("Valor gasto na viagem: R$ %.2f\n", valorTotalGasolina + valorTotalPedagio);
    }
}
