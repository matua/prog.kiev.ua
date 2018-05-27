package JavaStart.Lesson3.Level2;
/*
Created by matua on 27.05.2018 at 19:03
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        double aX = 0.0;
        double aY = 0.0;
        double bX = 4.0;
        double bY = 4.0;
        double cX = 6.0;
        double cY = 1.0;
        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координату x для точки.");
        x = scanner.nextDouble();

        System.out.println("Введите координату y для точки.");
        y = scanner.nextDouble();

        double n1 = ((bY - aY) * (x - aX)) - ((bX - aX) * (y - aY));
        double n2 = ((cY - bY) * (x - bX)) - ((cX - bX) * (y - bY));
        double n3 = ((aY - cY) * (x - cX)) - ((aX - cX) * (y - cY));

        if (((n1 > 0) && (n2 > 0) && (n3 > 0)) || (n1 < 0) && (n2 < 0) && (n3 < 0)) {
            System.out.println("Точка находится внутри треуголника.");
        } else {
            System.out.println("Точка находится за пределами треуголника.");
        }
    }
}
