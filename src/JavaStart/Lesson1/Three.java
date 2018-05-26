package JavaStart.Lesson1;
/*
Created by matua on 26.05.2018 at 21:01
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        System.out.println("Введите, пожалуйста, радиус окружности и нажмите ENTER");

        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        System.out.println("Длина окружности равна: " + 2 * Math.PI * radius);


    }
}
