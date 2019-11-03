package ThreadOne;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Rating {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        int numElements = ThreadLocalRandom.current().nextInt(1, 10);

        for (int i = 0; i < numElements; i++) {
            integers.add(ThreadLocalRandom.current().nextInt(1, 7));

        }
        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;

        }
        System.out.println(integers);
        System.out.println(("Average:") + (double) sum / integers.size());

    }
}
