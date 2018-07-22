package OOP.Lesson6.Two;
/*
Created by matua on 10.07.2018 at 14:16
*/

public class MultiThreadMainTester {
    public static void main(String[] args) throws InterruptedException {
        int resultSingleThread = 0;
        int resultFourThreadsWithVariables = 0;
        int[] array = new int[350_000_000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int split = array.length / 4;

        //Testing in multithreaded mode with variables calculation
        long start = System.currentTimeMillis();

        SumCounterThread sumCounter1 = new SumCounterThread(0, split, array);
        Thread thread1 = new Thread(sumCounter1);
        thread1.start();
        SumCounterThread sumCounter2 = new SumCounterThread(split + 1, split * 2, array);
        Thread thread2 = new Thread(sumCounter2);
        thread2.start();
        SumCounterThread sumCounter3 = new SumCounterThread(split * 2 + 1, split * 3, array);
        Thread thread3 = new Thread(sumCounter3);
        thread3.start();
        SumCounterThread sumCounter4 = new SumCounterThread(split * 3 + 1, array.length - 1, array);
        Thread thread4 = new Thread(sumCounter4);
        thread4.start();

        thread1.join();
        thread2.join();
        thread3.join();
        thread4.join();

        resultFourThreadsWithVariables = sumCounter1.getSum() + sumCounter2.getSum() + sumCounter3.getSum() + sumCounter4.getSum();

        long end = System.currentTimeMillis();

        Long fourThreadsProductivityWithVariablesCalculation = end - start;

        //Testing in multithreaded mode with direct input of literals for calulcation limits
        start = System.currentTimeMillis();

        SumCounterThread sumCounter11 = new SumCounterThread(0, 87_500_000, array);
        Thread thread1_2 = new Thread(sumCounter11);
        thread1_2.start();
        SumCounterThread sumCounter22 = new SumCounterThread(87_500_001, 175_000_000, array);
        Thread thread2_2 = new Thread(sumCounter22);
        thread2_2.start();
        SumCounterThread sumCounter33 = new SumCounterThread(175_000_001, 262_500_000, array);
        Thread thread3_2 = new Thread(sumCounter33);
        thread3_2.start();
        SumCounterThread sumCounter44 = new SumCounterThread(262_500_001, 349_999_999, array);
        Thread thread4_2 = new Thread(sumCounter44);
        thread4_2.start();

        thread1_2.join();
        thread2_2.join();
        thread3_2.join();
        thread4_2.join();

        long resultFourThreadsWithoutVariables = sumCounter11.getSum() + sumCounter22.getSum() + sumCounter33.getSum() + sumCounter44.getSum();

        end = System.currentTimeMillis();

        Long fourThreadsProductivityWithoutVariablesCalculation = end - start;

        //testing in one thread mode
        start = System.currentTimeMillis();

        for (int i = 0; i < array.length; i++) {
            resultSingleThread += array[i];
        }
        end = System.currentTimeMillis();

        Long singleThreadProductivity = end - start;

        System.out.println("resultSingleThread = " + resultSingleThread);
        System.out.println("resultFourThreadsWithVariables = " + resultFourThreadsWithVariables);
        System.out.println("resultFourThreadsWithoutVariables = " + resultFourThreadsWithoutVariables);


        System.out.println("singleThreadProductivity = " + singleThreadProductivity);
        System.out.println("fourThreadsProductivityWithVariablesCalculation = " + fourThreadsProductivityWithVariablesCalculation);
        System.out.println("fourThreadsProductivityWithoutVariablesCalculation = " + fourThreadsProductivityWithoutVariablesCalculation);
    }
}

/*
Output:

resultSingleThread = 1575048028
resultFourThreadsWithVariables = 1575048028
resultFourThreadsWithoutVariables = 1575048028
singleThreadProductivity = 132
fourThreadsProductivityWithVariablesCalculation = 96
fourThreadsProductivityWithoutVariablesCalculation = 85

*/
