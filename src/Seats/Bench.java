package Seats;

class Bench {
    private int availableSeats;

    Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    synchronized void takeASeat() {
        if (availableSeats >0) {
            System.out.println("Take a seat");
            availableSeats--;
            System.out.println("Free seats left" + availableSeats);
        } else {
            System.out.println("There are no available seats. : (");
        }
    }
}
