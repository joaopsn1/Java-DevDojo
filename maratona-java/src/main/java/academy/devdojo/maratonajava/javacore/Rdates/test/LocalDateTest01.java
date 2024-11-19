package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2024, Month.SEPTEMBER, 14);
        LocalDate agora = LocalDate.now();
        agora.plusWeeks(4);
        System.out.println(date.getYear()); //Imprimir ano
        System.out.println(date.getMonth()); //Imprimir mês
        System.out.println(date.getMonthValue()); //Imprimir mês em número
        System.out.println(date.getDayOfMonth()); //Imprimir dia
        System.out.println(date.getDayOfWeek()); //Imprimir dia da semana
        System.out.println(date.getDayOfYear()); //Imprimir dia do ano
        System.out.println(date.lengthOfMonth()); //Imprimir se o mêstem 31 dias
        System.out.println(date.isLeapYear()); //Imprimir se é ano bissexto - True or False
        System.out.println(date.get(ChronoField.YEAR)); //Imprimir ano
        System.out.println(date.get(ChronoField.DAY_OF_MONTH)); //Imprimir dia do mês
        System.out.println(date);
        System.out.println(agora); //Imprime a data de hoje
        System.out.println(LocalDate.MAX); //Imprime a maior data que pode usar
        System.out.println(LocalDate.MIN); //Imprime a menor data que pode usar
    }
}
