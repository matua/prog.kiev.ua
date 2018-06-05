package JavaStart.Lesson6.Level1;
/*
Created by matua on 05.06.2018 at 22:12
*/

public class Four {
    public static void main(String[] args) {
        System.out.println(searchArray(3, new int[]{3, 5, 2, 54}));
    }

    public static int searchArray(int element, int... array) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }
}
