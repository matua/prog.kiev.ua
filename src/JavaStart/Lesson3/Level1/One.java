package JavaStart.Lesson3.Level1;
/*
Created by matua on 27.05.2018 at 17:23
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите певрое число.");
        a = scanner.nextInt();
        System.out.println("Пожалуйста, введите второе число.");
        b = scanner.nextInt();
        System.out.println("Пожалуйста, введите третье число.");

        c = scanner.nextInt();
        System.out.println("Пожалуйста, введите четвертое число.");
        d = scanner.nextInt();

        max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }

        System.out.println("Самое большое из введенных Вами числ = " + max + ".");
    }
}
