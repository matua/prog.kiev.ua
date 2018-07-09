package OOP.Lesson5.One;
/*
Created by matua on 09.07.2018 at 19:09
*/

import java.io.File;
import java.io.IOException;

public class DocCopierTester {
    public static void main(String[] args) throws IOException {
        File directoryA = new File("/Users/matua/Downloads");
        File directoryB = new File("/Users/matua/Downloads/B");
        DocCopier.copy(directoryA, directoryB);
    }
}
