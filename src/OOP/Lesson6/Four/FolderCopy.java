package OOP.Lesson6.Four;
/*
Created by matua on 22.07.2018 at 20:05
*/

import java.io.File;
import java.util.Arrays;

public class FolderCopy {
    public static void folderCopy(File folderToCopy, File folderCopy) {
        File[] files = folderToCopy.listFiles();
        //counter of TENs in the length of the array
        int counter = 0;
        //condition when the loops has to exit
        int numberOfPossibleCounters = files.length / 10;
        //number of elements in the array to create when they are less then 10 (in the remainder)
        /*For example if the number of files (File [] file.length == 49), then on every iteration we copy an array with 10 elements [0 - 9], then [10 - 19], then [20 - 29], then [30 - 39], then on the last we copy [40 - 48]. If we just copy elements by 10s - then we will have null elements which we do not want*/
        int remainder = files.length % 10;
        int i = 0;
        while (i < files.length) {
            File[] tenOrLessFilesToCopy;
            if (counter < numberOfPossibleCounters) {
                tenOrLessFilesToCopy = Arrays.copyOfRange(files, i, i + 9);
            } else {
                tenOrLessFilesToCopy = Arrays.copyOfRange(files, i, i + remainder);
            }

            Thread thread = new Thread(new ThreadCopy(tenOrLessFilesToCopy, folderCopy));
            thread.start();
            i += 10;
            counter++;
        }
    }
}
