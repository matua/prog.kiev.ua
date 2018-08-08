package OOP.Lesson7.Three;
/*
Created by matua on 05.08.2018 at 20:39
*/

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What are we looking for?");
        String userFile = scanner.nextLine();

        System.out.println("Where are we looking at?");
        File userFolder = new File(scanner.nextLine());

        long start = System.currentTimeMillis();
/*
        TESTING DATA without user input
        String userFile = "search.pdf";
        File userFolder = new File("/Users/matua/Downloads");

        */

        ExecutorService letsSearch = Executors.newFixedThreadPool(1);

        File[] files = userFolder.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                letsSearch.submit(new SearchThread(userFile, file));
            }
            if (file.getName().equals(userFile)) {
                System.out.println(file);
            }
        }

        letsSearch.shutdown();

        long end = System.currentTimeMillis();
        System.out.printf("\nFound in %s in %d milliseconds", userFolder, (end - start));
    }
}
