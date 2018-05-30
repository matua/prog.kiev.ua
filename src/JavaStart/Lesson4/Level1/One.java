package JavaStart.Lesson4.Level1;
/*
Created by matua on 29.05.2018 at 22:39
*/

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        int lines;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ведите количество полос для обоев.");

        lines = scanner.nextInt();
        boolean line = true;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < lines; j++) {
                if (line) {
                    System.out.print("***");
                    line = false;
                } else {
                    System.out.print("+++");
                    line = true;
                }
            }
            System.out.println();
            line = true;
        }
    }
}
