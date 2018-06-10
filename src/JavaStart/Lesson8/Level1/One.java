package JavaStart.Lesson8.Level1;
/*
Created by matua on 10.06.2018 at 20:14
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        System.out.println("Please input text. When done press ENTER and then input SAVE and press ENTER again.");
        Scanner scanner = new Scanner(System.in);

        StringBuilder stringBuilder = new StringBuilder();

        String marker = "";

        while(true) {
            marker = scanner.nextLine();
            if (marker.equals("SAVE")) {
                break;
            }
            stringBuilder.append(marker).append(System.lineSeparator());
        }

        File file = new File("fileToSave.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
