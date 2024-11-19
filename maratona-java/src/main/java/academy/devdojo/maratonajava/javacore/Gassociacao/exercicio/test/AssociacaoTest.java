package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Ivo Campiom, 131 - Jd. Oriental");
        Local local1 = new Local("Rua José Garcia Leal, 116 - Sts. Dumont");
        Aluno aluno = new Aluno("João Pedro", 8);
        Aluno aluno2 = new Aluno("Lucas", 9);
        Aluno aluno3 = new Aluno("Matheus", 10);
        Professor professor = new Professor("Nicoli", "Pedagogia");
        Aluno[] alunos = {aluno, aluno2};
        Aluno[] alunos1 = {aluno3};
        Seminario seminario = new Seminario("Consumo de Água", alunos, local);
        Seminario seminario2 = new Seminario("Desmatamento", alunos1, local);
        Seminario[] seminarios = {seminario, seminario2};

        seminario.setLocal(local);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);

        seminario2.setLocal(local1);
        aluno3.setSeminario(seminario2);

        professor.setSeminarios(seminarios);

        System.out.println("Alunos");
        aluno.imprime();
        System.out.println();
        aluno2.imprime();
        System.out.println();
        aluno3.imprime();

        System.out.println("-----------------------------");

        System.out.println("Seminário");
        seminario.imprime();
        System.out.println();
        seminario2.imprime();

        System.out.println("-------------------");

        System.out.println("Professor");
        professor.imprime();
    }
}
