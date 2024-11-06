package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("João")); //Lança execessão se não tiver espaço;
        System.out.println(tq.offer("João")); //Lança true or false se tiver ou não espaço;
        System.out.println(tq.offer("João", 10, TimeUnit.SECONDS));
        tq.put("Pedro"); //Se não tiver espaço, ele bloqueia até ser liberado;
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Souza"); //Bloqueia a Thread até um elemento tentar pegar um valor que você colocou;
        }
        System.out.println(tq.tryTransfer("Nunes", 5, TimeUnit.SECONDS)); //Substitui o if;
        System.out.println(tq.element()); //Exibe o primeiro elemento da fila
        System.out.println(tq.peek());
        System.out.println(tq.poll()); //Remove o 1º elemento da fila ou retorna null se estiver vazia
        System.out.println(tq.remove()); //Mesma coisa do poll mas lança execessão ao invés de null
        System.out.println(tq.take()); //Pega o 1º valor, mostra e remove, caso esteja vazia, ele fica esperando até alguem colocar o valor la dentro
        System.out.println(tq.remainingCapacity());
    }
}
