
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static ConcurrentLinkedQueue<String> orders = new ConcurrentLinkedQueue<>();
    public static Integer orderNo = 1;
    public static void main(String[] args){

        Thread CounterThread1 = new Thread(new Counter());
        CounterThread1.setName(" 1 ");

        Thread CounterThread2 = new Thread(new Counter());
        CounterThread1.setName(" 2 ");

        Thread CounterThread3 = new Thread(new Counter());
        CounterThread1.setName(" 3 ");

        Thread ChefThread1 = new Thread(new Chef());
        ChefThread1.setName(" 1 ");

        Thread ChefThread2 = new Thread(new Chef());
        ChefThread1.setName(" 2 ");

        Thread ChefThread3 = new Thread(new Chef());
        ChefThread1.setName(" 3 ");

        CounterThread1.start();
        CounterThread2.start();
        CounterThread3.start();

        ChefThread1.start();
        ChefThread2.start();
        ChefThread3.start();

    }
}
