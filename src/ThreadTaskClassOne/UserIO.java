package ThreadTaskClassOne;

import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class UserIO {
    public static void work(int n, int m) {
        int[][] arr = new int[n][m];
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                arr[i][j] = random.current().nextInt(0, 10);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Array.toString(arr[i]));

        }
        Sum sum = new Sum();
        SumCalculator[] calcs = new SumCalculator[t];
        for (int i = 0; i < calcs.length; i++) {
            calcs[i] = new SumCalculator(arr, i, t, sum);

        }
        startTime = System.currentTimeMillis();



    }

    public static void main(String[] args) {
        int n = 10;
        int m = 10;


    }
}