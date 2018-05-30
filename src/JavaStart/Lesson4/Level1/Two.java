package JavaStart.Lesson4.Level1;
/*
Created by matua on 29.05.2018 at 22:47
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        System.out.println("Введите число больше 4 и меньше 16");

        int number;
        int factorial = 1;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Факториал введенного числа = " + factorial);
    }
}
