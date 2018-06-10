package JavaStart.Lesson7.Level1;
/*
Created by matua on 09.06.2018 at 22:02
*/

import java.util.Arrays;

public class Two {
    public static void main(String[] args) {
        int [] array = {1, 5 ,6, 4, 34, 34 ,34, 4234};
        System.out.println(ArraysToString(array));

    }

    public static String ArraysToString(int [] array) {
        StringBuilder stringBuilder = new StringBuilder("[");

        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
