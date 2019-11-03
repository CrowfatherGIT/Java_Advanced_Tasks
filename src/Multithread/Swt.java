package Multithread;

public class Swt implements Runnable{
    private int start = 0;

    @Override
    public void run() {
        for (int i = start; i < start+10; i++) {
            System.out.println("Stopwatch:" +i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        start+=10;
    }
}
