package JavaStart.Lesson1;
/*
Created by matua on 26.05.2018 at 20:52
*/

public class Two {
    public static void main(String[] args) {
        double triangleSideOne = 5.345345;
        double triangleSideTwo = 6.123123;
        double triangleSideThree = 7.2342343;

        double p = (triangleSideOne + triangleSideTwo + triangleSideThree) / 2;

        double area = Math.sqrt(p * (p - triangleSideOne) * (p - triangleSideTwo) * (p - triangleSideThree));

        System.out.println("Площадь треугольника равна: " + area);
    }
}
