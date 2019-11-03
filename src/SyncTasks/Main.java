package SyncTasks;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Person> persons = new LinkedList<>();
        for (int i = 0; i < 10; ++i) {
            Person person = new Person(i);
            persons.add(person);
            new Thread(person).start();
        }
        Random r = new Random();
        while (true) {
            // Add new People
            if (r.nextDouble() > 0.5) {
                Person p = new Person(0);
                persons.add(p);
                new Thread(p).start();
            }
            // Kill some people
            if (r.nextDouble() > 0.5) {
                int i = ThreadLocalRandom.current()
                        .nextInt(0, persons.size());
                Person person = persons.get(i);
                person.die();
            }
            Thread.sleep(500);
        }
    }
}

