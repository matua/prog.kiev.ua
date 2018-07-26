package OOP.Lesson6.Three;
/*
Created by matua on 22.07.2018 at 13:40
*/

import java.util.Arrays;
import java.util.Random;

public class ShellSortingAlgorithm {
    public static void shellSort(int[] array) throws InterruptedException {
        int inner, outer;
        int temp;

        int h = 1;
        // ищем начальное значение h
        while (h <= array.length / 3) {
            h = h * 3 + 1;
        }

        Thread thread = null;

        for (; h > 0 ;) {
            thread = new Thread(new SortingThread(h, array), "Thread - " + String.valueOf(h));
            thread.start();
            h = (h - 1) / 3;
            thread.join();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        int[] unsortedArray = new int[25];
        Random random = new Random();
        for (int i = 0; i < unsortedArray.length; i++) {
            unsortedArray[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(unsortedArray));
        shellSort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
    }
}
