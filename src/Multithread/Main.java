package Multithread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Swt swt = new Swt();

        Thread t = new Thread(swt);
        t.start();
        t.join();

        System.out.println("First launch ended");

        Thread t2 = new Thread(swt);
        t2.start();
        t2.join();

        System.out.println("Second launch ended");

    }
}
