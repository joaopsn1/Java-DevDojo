package listaexercicio.ex07.dominio;

public class Aluno extends Pessoa {
    private String matricula;
    private double[] notas;
    private double media;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void dadosAluno() {
        super.dados();
        System.out.println("Matrícula: " + this.matricula);
    }

    public void mediaNotas(double[] notas) {
        double soma = 0;
        int i = 1;
        for (double nota : notas) {
            System.out.printf("Nota " + i + ": %.2f\n", nota);
            soma += nota;
            i++;
        }
        media = soma / notas.length;
        System.out.printf("Média: %.2f\n", media);
    }

    public void situacao() {
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media < 7 && media >= 4) {
            System.out.println("Exame");
        } else {
            System.out.println("Reprovado");
        }
    }

    public double getMedia() {
        return media;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
