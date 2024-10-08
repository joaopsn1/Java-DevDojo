package carro.test;

import carro.dominio.Carro;
import carro.dominio.ImpressoraCarro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        ImpressoraCarro impressoraCarro = new ImpressoraCarro();

        carro.nome = "Honda Civic";
        carro.modelo = "G10 Turbo Touring";
        carro.ano = 2021;
        carro.tanque = 55;
        carro.consumo = 12.3;
        carro.distanciaViagem = 500;
        carro.valorGasolina = 6.13;
        carro.valorPedagio = 9.80;
        carro.quantidadePedagio = 4;

        impressoraCarro.imprime(carro);
        carro.gastoDeCombustivel();
        carro.gastoViagem();
    }
}
