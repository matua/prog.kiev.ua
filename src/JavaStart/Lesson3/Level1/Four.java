package JavaStart.Lesson3.Level1;
/*
Created by matua on 27.05.2018 at 18:21
*/

import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
//        assert (args.length != 0):"ERROR";
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.println("Введите, пожалуйста, первую сторону предполагемого треуголника. Можно с плавающей точкой.");
        a = scanner.nextDouble();

        System.out.println("Введите, пожалуйста, вторую сторону предполагемого треуголника. Можно с плавающей точкой.");
        b = scanner.nextDouble();

        System.out.println("Введите, пожалуйста, третью сторону предполагемого треуголника. Можно с плавающей точкой.");
        c = scanner.nextDouble();

        if (((a + b) > c) && ((a + c) > b) && ((b + c) > a)) {
            System.out.println("Судя по введенным Вами данным - такой треугольник существовать может.");
        } else {
            System.out.println("Судя по введенным Вами данным - такой треуголник существовать НЕ может.");
        }

    }
}
