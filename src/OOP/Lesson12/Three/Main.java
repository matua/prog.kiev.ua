package OOP.Lesson12.Three;
/*
Created by matua on 23.08.2018 at 20:21
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is URL? Without slashes after main domain please...");

        UrlToFileOfLinks.searchForLinks(new Scanner(System.in).nextLine());
    }
}