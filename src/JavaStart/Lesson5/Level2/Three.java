package JavaStart.Lesson5.Level2;
/*
Created by matua on 02.06.2018 at 9:39
*/

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        double amount;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("How much money do you have?");
            amount = scanner.nextDouble();
            if ((amount > 0) && (amount < 1_000_000_000)) {
                break;
            } else {
                System.out.println("You money has to be more than zero and less than a billion.\n");
            }
        }

        int main;
        int decimal;

        main = (int)amount;
        decimal = (int)((amount - main) * 100);

        System.out.println("main = " + main);
        System.out.println("decimal = " + decimal);
        int [] array;

        if (main < 10) {
            array = new int[1];
        } else if ((main > 10) && (main < 100)) {
            array = new int[2];
        } else if ((main > 101) && (main < 1_000)) {
            array = new int[3];
        } else if ((main > 1_001) && (main < 10_000)) {
            array = new int[4];
        } else if ((main > 10_001) && (main < 100_000)) {
            array = new int[5];
        } else if ((main > 100_001) && (main < 1_000_000)) {
            array = new int[6];
        } else if ((main > 1_000_001) && (main < 10_000_000)) {
            array = new int[7];
        } else if ((main > 10_000_001) && (main < 100_000_000)) {
            array = new int[8];
        } else {
            array = new int[9];
        }

        for (int i = array.length - 1; i >= 0; i--) {
                int number = main % 10;
                main /= 10;
                array[i] = number;
        }

        String mainString = "";

        for (int i = 0; i < array.length; i++) {

        }

        System.out.println(Arrays.toString(array));


    }
}
