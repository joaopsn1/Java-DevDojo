package test.pagamento;

import dominio.pagamento.ContaBancaria;
import dominio.pagamento.Pessoa;
import dominio.pagamento.Tenis;
import dominio.pagamento.TipoPagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João Pedro", 22);
        ContaBancaria contaBancaria = new ContaBancaria(pessoa);
        Tenis tenis = new Tenis(pessoa, "Air Jordan", 1500, TipoPagamento.CREDITO);

        contaBancaria.abrirConta(123456, 171201);
        contaBancaria.imprime();
        System.out.println("---------------------------------");
        tenis.imprime();
        System.out.println(TipoPagamento.CREDITO.taxaMaquininha(tenis.getValor()));
        tenis.parcelas();

        System.out.println("---------------------------------");

        Pessoa pessoa1 = new Pessoa("Nicoli", 19);
        ContaBancaria contaBancaria1 = new ContaBancaria(pessoa1);
        Tenis tenis1 = new Tenis(pessoa1, "Vert", 650, TipoPagamento.DEBITO);

        contaBancaria1.abrirConta(987654, 150505);
        contaBancaria1.imprime();
        System.out.println("---------------------------------");
        tenis1.imprime();
        System.out.println(TipoPagamento.DEBITO.taxaMaquininha(tenis1.getValor()));
        tenis1.parcelas();

        System.out.println("---------------------------------");
        Pessoa pessoa2 = new Pessoa("Lucas", 17);
        ContaBancaria contaBancaria2 = new ContaBancaria(pessoa2);
        Tenis tenis2 = new Tenis(pessoa2, "Air Force", 700, TipoPagamento.PIX);

        contaBancaria2.abrirConta(147258, 123789);
        contaBancaria2.imprime();
        System.out.println("---------------------------------");
        tenis2.imprime();
        System.out.println(TipoPagamento.PIX.descontoPagamento(700));
        tenis2.parcelas();
    }
}
