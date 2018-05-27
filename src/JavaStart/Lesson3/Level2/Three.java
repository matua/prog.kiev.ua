package JavaStart.Lesson3.Level2;
/*
Created by matua on 27.05.2018 at 20:11
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Введите четырехзначное число.");

        int number;
        int one;
        int two;
        int three;
        int four;
        int magicNumber; //Допустим, если число 4599 - то 9 и 18, далее 18 --> 1 + 8 = 9 значит 9 == 9 ИЛИ 3387 --> 3 + 3 == 6 и 8 + 7 == 15 --> 1 + 6 == 6 значит 6 == 6 ИЛИ 3176 и так далее
        int oneMagicNumber;
        int twoMagicNumber;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        one = number / 1_000;
        two = number / 100 % 10;
        three = number / 10 % 10;
        four = number % 10;

        if ((one + two) == (three + four)) {
            System.out.println("Ваш билет счастливый.");
        } else {
            magicNumber = three + four;
            oneMagicNumber = magicNumber / 10;
            twoMagicNumber = magicNumber % 10;

            if ((one + two) == (oneMagicNumber + twoMagicNumber)) {
                System.out.println("Ваш билет супер счастливый.");
            } else {
                System.out.println("Ваш билет обычный");
            }
        }
    }
}
