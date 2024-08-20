package escola.dominio;

public class Professor extends Pessoa{
    private Materia materia;

    public Professor(String nome, int idade) {
        super(nome, idade);
    }

    public Professor(String nome, int idade, Materia materia) {
        super(nome, idade);
        this.materia = materia;
    }

    public void imprime() {
        System.out.println("Professor");
        super.imprime();
        System.out.println("Materia Lecionada: " + materia.getMateria());
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
