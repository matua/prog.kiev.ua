package JavaStart.Lesson7.Level1;
/*
Created by matua on 09.06.2018 at 22:16
*/

public class Four {
    public static void main(String[] args) {
        int signs = 2;

        for (int i = signs; i < signs + 10; i++) {
            String output = String.format("%." + i + "f", Math.PI);
            System.out.println(output);
        }
    }
}
