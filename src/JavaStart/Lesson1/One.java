package JavaStart.Lesson1;
/*
Created by matua on 26.05.2018 at 20:42
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        System.out.println("Пожалуйста, введите 5-и значное число и нажмите ENTER");

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int one = number / 10_000;
        int two = number / 1_000 % 10;
        int three = number / 100 % 10;
        int four = number / 10 % 10;
        int five = number % 10;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);


    }
}
