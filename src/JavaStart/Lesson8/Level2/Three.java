package JavaStart.Lesson8.Level2;
/*
Created by matua on 10.06.2018 at 21:07
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Three {
    public static void main(String[] args) {
        File file = new File("ASCCIArt.txt");
        createASCIIArt(file);
     }

    public static void createASCIIArt(File file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < 40; i++) {
                for (int j = 0; j < 8; j++) {
                    if ((j % 2 == 0)) {
                        printWriter.print("* ///");
                    } else {
                        printWriter.print("* \\\\\\");
                    }
                }
                printWriter.print(System.lineSeparator());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
