package Person;

public class Person implements Comparable<Person> {

    private int height;

    public Person(int height) {
        this.height = height;
    }


    @Override
    public int compareTo(Person o) {
        return height - o.height;
    }
}

