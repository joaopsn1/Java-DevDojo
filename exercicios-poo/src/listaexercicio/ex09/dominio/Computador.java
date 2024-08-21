package listaexercicio.ex09.dominio;

public class Computador extends Produto {
    public Computador(String nome, double preco, int quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void valorTotalEstoque() {
        super.valorTotalEstoque();
    }

    @Override
    public void verificaEstoque() {
        super.verificaEstoque();
    }
}
