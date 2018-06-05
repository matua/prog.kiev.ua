package JavaStart.Lesson6.Level1;
/*
Created by matua on 05.06.2018 at 22:10
*/

public class Three {
    public static void main(String[] args) {
        drawRectangle(9, 5);
    }

    public static void drawRectangle(int length, int width) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
