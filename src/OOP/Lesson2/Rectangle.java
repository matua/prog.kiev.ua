package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 14:43
*/

public class Rectangle extends Shape {
    private Point a;
    private Point b;
    private Point c;
    private Point d;
    private double sideOne;
    private double sideTwo;

    public Rectangle(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        sideOne = Math.hypot(a.getX() - b.getX(), a.getY() - b.getY());
        sideTwo = Math.hypot(b.getX() - c.getX(), b.getY() - c.getY());
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }

    @Override
    public double getPerimetr() {
        return  sideOne + sideTwo * 2;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }
}
