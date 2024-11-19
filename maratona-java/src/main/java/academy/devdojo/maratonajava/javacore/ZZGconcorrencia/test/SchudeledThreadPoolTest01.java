package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class SchudeledThreadPoolTest01 {
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    private static void beeper() {
        Runnable r = () -> {
            System.out.println(LocalTime.now().format(formatter) + " beep");
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

//        executor.schedule(r, 5, TimeUnit.SECONDS);
        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleWithFixedDelay(r, 1, 5, TimeUnit.SECONDS); //Começa a contar do momento que a Thread acorda
//        ScheduledFuture<?> scheduleWithFixedDelay = executor.scheduleAtFixedRate(r, 1, 5, TimeUnit.SECONDS); //Continua contando mesmo com a Thread dormindo
        executor.schedule(() -> {
            System.out.println("Cancelando o scheduleWithFixedDelay");
            scheduleWithFixedDelay.cancel(false);
            executor.shutdown();
        }, 20, TimeUnit.SECONDS);
    }

    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        beeper();
    }
}
