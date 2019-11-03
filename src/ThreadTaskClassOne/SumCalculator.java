package ThreadTaskClassOne;

public class SumCalculator extends Thread{

    public SumCalculator (int [][] arr, int idx, int skip, Sum sum) {

        aArr = arr;
        aIdx = idx;
        aSkip = skip;
        aSum= sum;

    }

    @Override
    public void run() {
        super.run();
    }
}
