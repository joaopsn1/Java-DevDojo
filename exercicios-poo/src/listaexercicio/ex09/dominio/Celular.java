package listaexercicio.ex09.dominio;

public class Celular extends Produto {

    public Celular(String nome, double preco, int quantidade) {
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
