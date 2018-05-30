package JavaStart.Lesson4.Level2;
/*
Created by matua on 29.05.2018 at 23:12
*/

public class Two {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i + " ");
            }
            count = 0;
        }
    }
}
