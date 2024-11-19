package academy.devdojo.maratonajava.introducao;

/**
 * Prática
 * <p>
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * <p>
 * Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salário>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "João Pedro";
        String endereco = "Rua Ivo Campion, 131 - Jd. Oriental";
        double salario = 5750.75;
        String dataRecebimento = "29/07/2024";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + " confirmo que recebi o salário de R$ " + salario + ", na data " + dataRecebimento;

        System.out.println(relatorio);
    }
}
