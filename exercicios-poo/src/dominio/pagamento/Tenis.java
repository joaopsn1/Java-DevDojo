package dominio.pagamento;

import java.util.Scanner;

public class Tenis {
    Scanner scanner = new Scanner(System.in);
    private Pessoa pessoa;
    private String tenis;
    private double valor;
    private TipoPagamento tipoPagamento;

    public Tenis(Pessoa pessoa, String tenis, double valor, TipoPagamento tipoPagamento) {
        this.pessoa = pessoa;
        this.tenis = tenis;
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    public void imprime() {
        System.out.println("Cliente: " + pessoa.getNome());
        System.out.println("Tenis: " + this.tenis);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Tipo de Pagamento: " + tipoPagamento);
    }

    public void parcelas() {
        if (tipoPagamento == TipoPagamento.CREDITO) {
            System.out.print("Quantas Parcelas? ");
            int parcelas = scanner.nextInt();
            double valorParcelas = getTipoPagamento().taxaMaquininha(this.valor) / parcelas;
            System.out.println(parcelas + " parcelas de R$ " + valorParcelas );
            return;
        }
        System.out.println("Tenis pago a vista!");
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
