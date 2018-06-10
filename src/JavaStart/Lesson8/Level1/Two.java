package JavaStart.Lesson8.Level1;
/*
Created by matua on 10.06.2018 at 20:42
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Two {
    public static void main(String[] args) {
        int [][] array = {{3, 4, 554},{23, 32323, 32},{23, 234, 2}};
        File file = new File("fileForArray.txt");
        saveArrayToFile(array, file);
    }

    public static void saveArrayToFile(int [][] array, File file) {
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[0].length; column++) {
                    printWriter.format("%d\t", array[row][column]);
                }
                printWriter.println();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
