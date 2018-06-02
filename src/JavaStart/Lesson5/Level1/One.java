package JavaStart.Lesson5.Level1;
/*
Created by matua on 01.06.2018 at 17:27
*/

public class One {
    public static void main(String[] args) {
        int [] array = {0, 5, 2, 4, 7, 1, 3, 19};
        int counter = 0;

        for (int i: array) {
            if ((i % 2) != 0) {
                counter ++;
            }
        }

        System.out.println("Количество нечетных цифр в массиве = " + counter);

    }
}
