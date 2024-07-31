package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Luffy";
        estudante01.idade = 21;
        estudante01.sexo = 'M';

        estudante02.nome = "Nami";
        estudante02.idade = 25;
        estudante02.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante02);
    }
}
