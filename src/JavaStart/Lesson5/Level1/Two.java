package JavaStart.Lesson5.Level1;
/*
Created by matua on 01.06.2018 at 17:36
*/

import java.util.Arrays;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Введите размер массива.");
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int [] array = new int[length];



        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число для массива в ячейку " + i);
            array[i] = scanner.nextInt();
        }

        System.out.println("Ваш массив: " + Arrays.toString(array));
    }
}
