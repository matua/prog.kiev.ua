package OOP.Lesson12.One;
/*
Created by matua on 21.08.2018 at 17:43
*/

import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the file?");

        URLAvailability.check(new File(
                new Scanner(System.in).nextLine()));
    }
}
