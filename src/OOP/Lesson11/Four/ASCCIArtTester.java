package OOP.Lesson11.Four;
/*
Created by matua on 16.08.2018 at 22:49
*/

import java.util.Scanner;

public class ASCCIArtTester {
    public static void main(String[] args) {
        System.out.println("Please enter text in *small* letter only");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        ASCCIArt.convert(text);
        ASCCIArt.convert("prog.kiev.ua");
    }
}
