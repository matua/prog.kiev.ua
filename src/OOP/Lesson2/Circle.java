package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 14:37
*/

public class Circle extends Shape{
    private Point center;
    private Point radius;

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getRadius() {
        return radius;
    }

    public void setRadius(Point radius) {
        this.radius = radius;
    }

    public Circle(Point center, Point radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle";
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * Math.hypot(radius.getY() - center.getX(), radius.getY() - center.getX());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(Math.hypot(radius.getY() - center.getX(), radius.getY() - center.getX()), 2.0);
    }
}
