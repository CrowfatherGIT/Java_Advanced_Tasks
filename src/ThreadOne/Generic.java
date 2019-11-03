package ThreadOne;

public class Generic<T> {
    private T value;

    public Generic (T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "value=" + value +
                '}';
    }
}
