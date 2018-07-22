package OOP.Lesson5.TwoRefactored;
/*
Created by matua on 09.07.2018 at 19:44
*/

import java.io.*;

public class FilterSameWordsInTwoFiles {
    public static File now(File one, File two) throws IOException {
        return printToFile(one, searchDuplicates(readFiles(one, two)));

    }

    //reading two files and return a String array with contents of the files: result[0] - for File one, result[1] - for File two
    private static String[] readFiles(File one, File two) throws IOException {
        String[] result = {"", ""};

        try (BufferedReader fileOneBuffer = new BufferedReader(new FileReader(one));
             BufferedReader fileTwoBuffer = new BufferedReader(new FileReader(two))) {
            while (fileOneBuffer.ready()) {
                result[0] += fileOneBuffer.readLine();
            }
            while (fileTwoBuffer.ready()) {
                result[1] += fileTwoBuffer.readLine();
            }
        }
        return result;
    }

    //searching duplicate words in the array of Strings (texts). Returning a String that has duplicates of both files
    private static String searchDuplicates(String[] filesContents) {
        String[] fileOneWords = filesContents[0].split(" ");
        String[] fileTwoWords = filesContents[1].split(" ");

        StringBuilder result = new StringBuilder();

        for (String word1 : fileOneWords) {
            for (String word2 : fileTwoWords) {
                if (word1.equalsIgnoreCase(word2)) {
                    result.append(word1);
                    result.append(" ");
                }
            }
        }
        return result.toString();
    }

    //printing the String duplicates contents to a file named result.txt in the same folder as the one of the files to compare
    private static File printToFile(File one, String duplicates) throws IOException {
        File resultFile = new File(one.getParent() + "/" + "result.txt");
        resultFile.createNewFile();

        try (PrintWriter fileWriter = new PrintWriter(new FileWriter(resultFile))) {
            fileWriter.print(duplicates);
        }
        return resultFile;
    }
}
