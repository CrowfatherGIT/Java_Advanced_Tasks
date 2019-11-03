package Seats;

public class SeatTakerThread extends Thread {
    private Bench bench;

    SeatTakerThread(Bench bench) {
        this.bench = bench;
    }
    @Override
    public void run() {
        bench.takeASeat();
    }
}
