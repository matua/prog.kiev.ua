package OOP.Lesson2;
/*
Created by matua on 15.06.2018 at 14:47
*/

import java.util.Arrays;

public class Board {
    private Shape[] shapes = new Shape[4];

    public Board(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void putShape(Shape shape, int position) {
        try {
            System.out.format("Trying to put the %s in position %d..........", shape.toString(), position);
            if (shapes[position - 1] != null) {
                System.out.println("Place is already taken!");
            } else {
                shapes[position - 1] = shape;
                System.out.format("figure %s's been put into the space %d.\n", shape.toString(), position);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The board has 4 spaces only. You have to enter a space number from 1 to 4.");
        }
    }

    public void deleteShape(int position) {
        try {
            if (shapes[position - 1] != null) {
                String figureName = shapes[position - 1].toString();
                System.out.format("Trying to delete the %s from position %d..........", figureName, position);
            }
            if (shapes[position - 1] == null) {
                System.out.println("The space is already empty!");
            } else {
                String figureName = shapes[position - 1].toString();
                shapes[position - 1] = null;
                System.out.format("Figure %s's been deleted in the space %d.\n", figureName, position);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The board has 4 spaces only. You have to enter a space number from 1 to 4.\n");
        }
    }

    public double totalShapesArea() {
        double area = 0;
        for (Shape shape : shapes) {
            if (shape != null) {
                area +=shape.getArea();
            }
        }
        return area;
    }

    public String infoBoard() {
        return Arrays.toString(shapes);
    }
}
