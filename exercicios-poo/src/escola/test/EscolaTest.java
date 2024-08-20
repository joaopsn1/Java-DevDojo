package escola.test;

import escola.dominio.Aluno;
import escola.dominio.Materia;
import escola.dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Materia materia = new Materia("Matemática");
        Aluno aluno = new Aluno("João Pedro", 17, 9, materia, 3);
        Professor professor = new Professor("Nicoli", 35, materia);

        aluno.imprime();
        System.out.println("-------------------");
        professor.imprime();
    }
}
