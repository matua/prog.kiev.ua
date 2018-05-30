package JavaStart.Lesson4.Level1;
/*
Created by matua on 29.05.2018 at 22:59
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        int width;
        int height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ширину прямоуголника.");

        width = scanner.nextInt();

        System.out.println("Введите высоту прямоуголника.");

        height = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("*");
            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
    }
}
