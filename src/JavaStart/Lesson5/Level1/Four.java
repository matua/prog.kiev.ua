package JavaStart.Lesson5.Level1;
/*
Created by matua on 02.06.2018 at 8:19
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        System.out.println("Введите строку текста.");

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        char [] chars = text.toCharArray();

        int counter = 0;

        for (char ch: chars) {
            if (ch == 'b') {
                counter++;
            }
        }

        System.out.println("Количество симоволов 'b' в введенной строке = " + counter);
    }
}
