package listaexercicio.ex07.test;

import listaexercicio.ex07.dominio.Aluno;

public class AlunoTest {
    public static void main(String[] args) {
        double[] notas = {6, 10, 8};
        Aluno aluno = new Aluno("João Pedro", 17, "242.910");
        aluno.dadosAluno();
        aluno.mediaNotas(notas);
        aluno.situacao();
    }
}
