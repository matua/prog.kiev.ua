package JavaStart.Lesson4.Level1;
/*
Created by matua on 29.05.2018 at 22:47
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {

        int number;
        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите число больше 4 и меньше 16");
            number = scanner.nextInt();
            if ((number > 4) && (number < 16)) {
                break;
            } else {
                System.out.println("Число не подходит под параметры задачи.\n");
            }
        }
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        System.out.println("Факториал введенного числа = " + factorial);
    }
}