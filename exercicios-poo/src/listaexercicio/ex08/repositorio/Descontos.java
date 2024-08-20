package listaexercicio.ex08.repositorio;

public interface Descontos {
    public default void INSS() {
        System.out.println("Descontos do INSS");
        System.out.println("Salário de até R$ 1.045,00 - Desconto de 7,5%");
        System.out.println("Salário entre R$ 1.045,01 até R$ 2.089,60 - Desconto de 9%");
        System.out.println("Salário entre 2.089,61 até R$ 3.134,40 - Desconto de 12%");
        System.out.println("Salário entre R$ 3.134,41 até R$ 10.000,00 - Desconto de 14%");
        System.out.println("Salário maior de R$ 10.000,00 - Desconto de 20%");
    }

    public default void FGTS() {
        System.out.println("Desconto FGTS");
        System.out.println("Porcentagem de 8% do salário");
    }

    public default double descontoINSS(double salario) {
        if (salario <= 1045) {
            return salario * 0.075;
        } else if (salario > 1045 && salario <= 2089.60) {
            return salario * 0.09;
        } else if (salario > 2089.60 && salario <= 3134.4) {
            return salario * 0.12;
        } else if (salario > 3134.40 && salario <= 10000) {
            return salario * 0.14;
        } else {
            return salario * 0.20;
        }
    }

    public default double descontoFGTS(double salario) {
        return salario * 0.08;
    }
}
