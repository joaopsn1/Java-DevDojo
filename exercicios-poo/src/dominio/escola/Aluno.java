package dominio.escola;

public class Aluno extends Pessoa{
    private double nota;
    private Materia materia;
    private int anoEscolar;

    public Aluno(String nome, int idade, double nota, Materia materia) {
        super(nome, idade);
        this.nota = nota;
        this.materia = materia;
    }

    public Aluno(String nome, int idade, double nota, Materia materia, int anoEscolar) {
        super(nome, idade);
        this.nota = nota;
        this.materia = materia;
        this.anoEscolar = anoEscolar;
    }

    public void imprime() {
        System.out.println("Aluno");
        super.imprime();
        System.out.println("Ano Escolar: " + this.anoEscolar + "°");
        System.out.println("Matéria: " + materia.getMateria());
        System.out.println("Nota: " + this.nota);
    }

    public int getAnoEscolar() {
        return anoEscolar;
    }

    public void setAnoEscolar(int anoEscolar) {
        this.anoEscolar = anoEscolar;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
