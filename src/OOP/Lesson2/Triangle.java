package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 14:23
*/

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        sideOne = Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
        sideTwo = Math.hypot(b.getX() - c.getX(), b.getY() - c.getY());
        sideThree = Math.hypot(c.getX() - a.getX(), c.getY() - a.getY());
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public double getPerimetr() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimetr() / 2 * (getPerimetr() / 2 - sideOne) * (getPerimetr() / 2 - sideTwo) * (getPerimetr() / 2 - sideThree));

    }
}
