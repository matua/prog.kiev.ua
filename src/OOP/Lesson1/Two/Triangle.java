package OOP.Lesson1.Two;
/*
Created by matua on 14.06.2018 at 21:32
*/

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public double getArea() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree));
    }
}

class TriangleTester {
    public static void main(String[] args) {
        Triangle triangleA = new Triangle(5.345345, 6.123123, 7.2342343);
        System.out.println(triangleA.getArea());

        Triangle triangleB = new Triangle(4, 3, 4);
        System.out.println(triangleB.getArea());
    }
}
