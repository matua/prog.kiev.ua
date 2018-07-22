package OOP.Lesson6.Two;
/*
Created by matua on 10.07.2018 at 14:01
*/


public class SumCounterThread implements Runnable {
    private int sum;
    private int start;
    private int end;
    private int[] array;

    public SumCounterThread(int start, int end, int[] array) {
        this.start = start;
        this.end = end;
        this.array = array;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = count();
    }

    public int count() {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += array[i];
        }
        return sum;
    }
}
