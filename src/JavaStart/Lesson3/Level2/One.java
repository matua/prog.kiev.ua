package JavaStart.Lesson3.Level2;
/*
Created by matua on 27.05.2018 at 18:48
*/

import java.util.Scanner;
import static java.lang.Math.*;

public class One {
    public static void main(String[] args) {
        double x;
        double y;
        double distance;
        double radius = 4.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату x для точки.");
        x = scanner.nextDouble();

        System.out.println("Введите координату y для точки.");
        y = scanner.nextDouble();

        distance = sqrt(pow(x, 2) + pow(y, 2));

        if (distance <= radius) {
            System.out.println("Точка лежит внутри круга");
        } else {
            System.out.println("Точка НЕ лежит внутри круга");
        }

    }
}
