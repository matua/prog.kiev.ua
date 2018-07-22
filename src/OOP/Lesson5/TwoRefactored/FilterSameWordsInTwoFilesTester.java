package OOP.Lesson5.TwoRefactored;
/*
Created by matua on 09.07.2018 at 20:02
*/

import java.io.File;
import java.io.IOException;

public class FilterSameWordsInTwoFilesTester {
    public static void main(String[] args) throws IOException {
        File file1 = new File("/Users/matua/Downloads/file1.txt");
        File file2 = new File("/Users/matua/Downloads/file2.txt");
        FilterSameWordsInTwoFiles.now(file1, file2);
    }
}
