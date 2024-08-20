package futebol.dominio;

public class Clube {
    private String nomeClube;
    private Jogador[] jogadores;
    private Estado estado;

    public Clube(Estado estado) {
        this.estado = estado;
    }

    public Clube(String nomeClube, Estado estado) {
        this.nomeClube = nomeClube;
        this.estado = estado;
    }

    public Clube(String nomeClube, Jogador[] jogadores, Estado estado) {
        this.nomeClube = nomeClube;
        this.jogadores = jogadores;
        this.estado = estado;
    }

    public void imprime() {
        System.out.println("Clube: " + this.nomeClube);
        System.out.println("Estado: " + estado.getEstado());
        if (jogadores == null) {
            System.out.println("Clube sem Jogadores. Necessário Contratar!");
            return;
        }
        System.out.println("Jogadores");
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
