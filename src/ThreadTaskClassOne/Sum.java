package ThreadTaskClassOne;

public class Sum {
    long sum = 0;

    public synchronized void add(long value) {
        sum += value;
    }

    @Override
    public String toString() {
        return "Sum{" +
                "sum=" + sum +
                '}';
    }
}
