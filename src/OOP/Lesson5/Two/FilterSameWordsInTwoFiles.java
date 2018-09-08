package OOP.Lesson5.Two;
/*
Created by matua on 09.07.2018 at 19:44
*/

import java.io.*;

public class FilterSameWordsInTwoFiles {
    public static File now(File one, File two) throws IOException {
        String fileOne = "";
        String fileTwo = "";
        File result = new File(one.getParent() + "/" + "result.txt");
        result.createNewFile();

        try (BufferedReader fileOneBuffer = new BufferedReader(new FileReader(one));
             BufferedReader fileTwoBuffer = new BufferedReader(new FileReader(two));
             PrintWriter fileWriter = new PrintWriter(new FileWriter(result))) {
            while(fileOneBuffer.ready()) {
                fileOne += fileOneBuffer.readLine();
            }
            while(fileTwoBuffer.ready()) {
                fileTwo += fileTwoBuffer.readLine();
            }

            String [] fileOneWords = fileOne.split(" ");
            String [] fileTwoWords = fileTwo.split(" ");

            for (String word1 : fileOneWords) {
                for (String word2 : fileTwoWords) {
                    if (word1.equalsIgnoreCase(word2)){
                        fileWriter.print(word1);
                        fileWriter.print(" ");
                    }
                }
            }
            return result;
        }
    }
}