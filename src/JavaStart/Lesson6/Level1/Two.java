package JavaStart.Lesson6.Level1;
/*
Created by matua on 05.06.2018 at 22:06
*/

public class Two {
    public static void main(String[] args) {
        System.out.println(concatenate(5, 4.56, "Hello"));

    }

    public static String concatenate(int i, double d, String s) {
        return s + (i + d);
    }
}
