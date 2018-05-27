package JavaStart.Lesson3.Level1;
/*
Created by matua on 27.05.2018 at 17:53
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, год.");

        int year;


        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println("В году 366 дней. Этот год високосный.");
            } else {
                System.out.println("В году 365 дней. Этот год не високосный.");
            }
        } else {
            if (year % 4 == 0) {
                System.out.println("В году 366 дней. Этот год високосный.");
            } else {
                System.out.println("В году 365 дней. Этот год не високосный.");
            }
        }
    }
}
