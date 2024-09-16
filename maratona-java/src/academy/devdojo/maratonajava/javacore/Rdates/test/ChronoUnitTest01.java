package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2001, Month.DECEMBER, 17, 12, 0, 0);
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dias de Vida: " + ChronoUnit.DAYS.between(aniversario, now));
        System.out.println("Semanas de Vida: " + ChronoUnit.WEEKS.between(aniversario, now));
        System.out.println("Meses de Vida: " + ChronoUnit.MONTHS.between(aniversario, now));
        System.out.println("Anos de Vida: " + ChronoUnit.YEARS.between(aniversario, now));
    }
}
