package test.escola;

import dominio.escola.Aluno;
import dominio.escola.Materia;
import dominio.escola.Professor;

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
