package JavaStart.Lesson5.Level1;
/*
Created by matua on 01.06.2018 at 17:57
*/

import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        int [] array = new int[15];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 100);
        }

        int [] arrayTwo = Arrays.copyOf(array, array.length * 2);

        for (int i = array.length; i < arrayTwo.length; i++) {
            arrayTwo[i] = array[i - array.length] * 2;
        }

        System.out.println(Arrays.toString(arrayTwo));
    }
}
