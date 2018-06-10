package JavaStart.Lesson8.Level1;
/*
Created by matua on 10.06.2018 at 20:57
*/

import java.io.File;

public class Three {
    public static void main(String[] args) {
        File file = new File(".");
        directoriesList(file);
    }

    public static void directoriesList (File directory) {
        File [] list = directory.listFiles();
        for (File file : list) {
            if (file.isDirectory()) {
                System.out.println(file);
            }
        }
    }
}
