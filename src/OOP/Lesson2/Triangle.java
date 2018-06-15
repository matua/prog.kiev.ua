package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 14:23
*/

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;

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

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle";
    }

    @Override
    public double getPerimetr() {
        return  Math.hypot(a.getX() - b.getX(), a.getY() - b.getY()) + Math.hypot(b.getX() - c.getX(), b.getY() - c.getY()) + Math.hypot(c.getX() - a.getX(), c.getY() - a.getY());
    }

    @Override
    public double getArea() {
        double p = (Math.hypot(a.getX() - b.getX(), a.getY() - b.getY()) + Math.hypot(b.getX() - c.getX(), b.getY() - c.getY()) + Math.hypot(c.getX() - a.getX(), c.getY() - a.getY())) / 2;
        return Math.sqrt(p * (p - Math.hypot(a.getX() - b.getX(), a.getY() - b.getY())) * (p - Math.hypot(b.getX() - c.getX(), b.getY() - c.getY())) * (p - Math.hypot(c.getX() - a.getX(), c.getY() - a.getY())));
    }
}
