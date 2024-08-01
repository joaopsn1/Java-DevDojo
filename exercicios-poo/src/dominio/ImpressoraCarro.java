package dominio;

public class ImpressoraCarro {
    public void imprime(Carro carro) {
        System.out.println("Dados do carro para a viagem: ");
        System.out.println(carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("--------------------------------------------");
        System.out.println("Distância da Viagem: " + carro.distanciaViagem + " Km");
    }
}
