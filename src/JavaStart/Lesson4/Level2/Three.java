package JavaStart.Lesson4.Level2;
/*
Created by matua on 30.05.2018 at 7:34
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Введите ширину песочных часов. Число должно быть нечетным.");

        int width;

        Scanner scanner = new Scanner(System.in);

        width = scanner.nextInt();

        int space = 0;

        for (int i = 0; i < width - 2; i++) {
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width - i * 2; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            System.out.println("SPACE");
            space++;
        }
//        System.out.println("space = " + space);

        for (int i = width - 3; i > 0; i--) {
            for (int j = space - 1; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < width - i * 2 ; j++) {
                System.out.print("*");
            }
            for (int j = space - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.println();
            space--;
        }


    }
}
