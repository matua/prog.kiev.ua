package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 15:02
*/

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Shape [] shapes = new Shape[4];
        Board board = new Board(shapes);

        board.putShape(new Circle(new Point(0, 0), new Point(0, 5)), 4);
        board.infoBoard();
        System.out.format("Board's total area is %.2f.\n", board.totalShapesArea());
        board.deleteShape(4);
        board.infoBoard();
        System.out.format("Board's total area is %.2f.\n", board.totalShapesArea());
        board.deleteShape(4);
        board.putShape(new Triangle(new Point(0, 0), new Point(0, 5), new Point(5, 0)), 4);
        board.putShape(new Triangle(new Point(0, 0), new Point(0, 5), new Point(0, 5)), 4);
        System.out.format("Board's total area is %.2f.\n", board.totalShapesArea());
        board.putShape(new Rectangle(new Point(0, 0), new Point(0, 10), new Point(10, 10), new Point(10, 0)), 1);
        System.out.format("Board's total area is %.2f.\n", board.totalShapesArea());
        board.putShape(new Circle(new Point(0, 0), new Point(0, 1)), 2);
        board.infoBoard();
        board.putShape(new Circle(new Point(0, 0), new Point(0, 2)), 3);
        board.infoBoard();
        board.putShape(new Circle(new Point(0, 0), new Point(0, 3)), 5);

        System.out.format("Board's total area is %.2f.\n", board.totalShapesArea());
        board.infoBoard();
    }
}
