package Seats;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Bench bench = new Bench(1);
        SeatTakerThread seatTaker1 = new SeatTakerThread(bench);
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench);

        seatTaker1.start();
        seatTaker2.start();



    }
}
