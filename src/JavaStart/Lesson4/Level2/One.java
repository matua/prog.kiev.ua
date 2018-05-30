package JavaStart.Lesson4.Level2;
/*
Created by matua on 29.05.2018 at 23:06
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {

        int height;

        System.out.println("Введите высоту фигуры");

        Scanner scanner = new Scanner(System.in);

        height = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            System.out.print("*");
        }

    }
}
