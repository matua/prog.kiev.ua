package JavaStart.Lesson6.Level1;
/*
Created by matua on 05.06.2018 at 22:00
*/

public class One {
    public static void main(String[] args) {
        int [] array = {1, 5, 34, 243 , 3, -2, 433, 3};
        System.out.println(getMax(array));
    }

    public static int getMax(int... figures) {
        int max = figures[0];
        for (int i = 1; i < figures.length; i++) {
            if (figures[i] > max) {
                max = figures[i];
            }
        }
        return max;
    }
}
