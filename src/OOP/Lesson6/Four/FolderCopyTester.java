package OOP.Lesson6.Four;
/*
Created by matua on 22.07.2018 at 20:24
*/

import java.io.File;
import java.io.IOException;

public class FolderCopyTester {
    public static void main(String[] args) throws IOException {
        File folder = new File("/Users/matua/Downloads/testCopy");
        File folderTo = new File("/Users/matua/Downloads/testCopyResult");
        FolderCopy.folderCopy(folder, folderTo);
    }
}
