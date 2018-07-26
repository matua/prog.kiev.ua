package OOP.Lesson6.Five;
/*
Created by matua on 26.07.2018 at 20:01
*/

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File fileToMonitor = new File("/Users/matua/Desktop/Diagram.png");
        while(!fileToMonitor.isDirectory()){
            System.out.println("Please enter the folder you want to monitor");
            Scanner scanner = new Scanner(System.in);
            fileToMonitor = new File(scanner.nextLine());
        }

        Thread thread = new Thread(new FileWatcherThread(fileToMonitor));
        thread.start();
    }
}
