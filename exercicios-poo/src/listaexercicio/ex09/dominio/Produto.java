package listaexercicio.ex09.dominio;

public abstract class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void valorTotalEstoque() {
        System.out.println("Valor Total em Estoque");
        double valorTotal = this.preco*this.quantidade;
        System.out.printf("R$ %.2f\n", valorTotal);
    }

    public void verificaEstoque() {
        if (this.quantidade > 0) {
            System.out.println("Quantidade em estoque: " + this.quantidade);
            return;
        }
        System.out.println("Produto em falta no estoque!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
