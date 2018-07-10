package OOP.Lesson6.Two;
/*
Created by matua on 10.07.2018 at 14:16
*/

public class MultiThreadMainTester {
    public static void main(String[] args) throws InterruptedException {
        int sum = 0;
        int [] array = new int[200_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        //Testing in multithreaded mode
        long start = System.currentTimeMillis();

        SumCounter sumCounter1 = new SumCounter(0, 50_000_000, array);
        Thread thread1 = new Thread(sumCounter1);
        thread1.start();
        SumCounter sumCounter2 = new SumCounter(50_000_001, 100_000_000, array);
        Thread thread2 = new Thread(sumCounter2);
        thread2.start();
        SumCounter sumCounter3 = new SumCounter(100_000_001, 150_000_000, array);
        Thread thread3 = new Thread(sumCounter3);
        thread3.start();
        SumCounter sumCounter4 = new SumCounter(150_000_001, 199_999_999, array);
        Thread thread4 = new Thread(sumCounter4);
        thread4.start();
        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        long end = System.currentTimeMillis();

        System.out.println("Time counting in 4 parallel threads: " + (end - start) + " ms");

        System.out.println(sumCounter1.getSum() + sumCounter2.getSum() + sumCounter3.getSum() + sumCounter4.getSum());


        //testing in one thread mode
        start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        end = System.currentTimeMillis();
        System.out.println("Time counting in 1 thread: " + (end - start) + " ms");
        System.out.println(sum);
    }
}
