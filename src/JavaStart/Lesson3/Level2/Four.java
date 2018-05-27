package JavaStart.Lesson3.Level2;
/*
Created by matua on 27.05.2018 at 20:23
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Введите шестизначное число.");

        int number;
        int one;
        int two;
        int three;
        int four;
        int five;
        int six;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        one = number / 100_000;
        two = number / 10_000 % 10;
        three = number / 1_000 % 10;
        four = number / 100 % 10;
        five = number / 10 % 10;
        six = number % 10;

        if ((one == six) && (two == five) && (three == four)) {
            System.out.println("Ваше число - полиндром.");
        } else {
            System.out.println("Ваше число не полиндром.");
        }
    }
}
