package listaexercicio.ex01.dominio;

public class Contador {
    private int itens;

    public void imprime() {
        System.out.println("Valor Contador: " + this.itens);
    }

    public int incrementarItens(int incremento) {
        System.out.println("Incrementando itens");
        return itens += incremento;
    }

    public void zerarItens() {
        System.out.println("Zerando itens");
        itens *= 0;
    }

    public int getItens() {
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }
}
