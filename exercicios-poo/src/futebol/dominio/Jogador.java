package futebol.dominio;

public class Jogador {
    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private Clube clube;

    public Jogador(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Jogador(String nome, int idade, double altura, double peso, Clube clube) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.clube = clube;
    }

    public void imprime() {
        System.out.println("Dados do Jogador");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Peso: " + this.peso);
        if (clube == null) {
            System.out.println("Jogador sem clube, livre para novas negociações!");
            return;
        }
        System.out.println("Clube: " + this.clube.getNomeClube() + " do Estado de " + this.clube.getEstado());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Clube getClube() {
        return clube;
    }

    public void setClube(Clube clube) {
        this.clube = clube;
    }
}
