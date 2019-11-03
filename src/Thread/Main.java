package Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        StopWatchThread stopWatchThread = new StopWatchThread("SW1");
        Thread stopWatchThread1 = new Thread(new StopWatchTread());
        stopWatchThread.start();
        stopWatchThread1.start();

        System.out.println("Main thread starts");
        Thread.sleep(5000);
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");
        stopWatchThread.join();
        System.out.println("blah blah blah");
    }
}
