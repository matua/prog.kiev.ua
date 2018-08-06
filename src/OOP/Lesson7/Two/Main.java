package OOP.Lesson7.Two;
/*
Created by matua on 05.08.2018 at 17:41
*/

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter file name that you want to copy.");
        Scanner scanner = new Scanner(System.in);

        String userFile = scanner.nextLine();

        File original = new File(userFile);

        File copy;

        if (original.getName().contains(".")) {
            copy = new File(original.getParent() + "/" + original.getName().substring(0, original.getName().lastIndexOf('.')) + "_COPY" + original.getName().substring(original.getName().lastIndexOf('.')));
        } else {
            copy = new File(original.getParent() + "/" +"_COPY");
        }


        Action copying = new Action(original);

        Thread copyingThread = new Thread(new FileReading(copying, original));
        Thread pastingThread = new Thread(new FileWriting(copying, copy));
        Thread statusThread = new Thread(new Status(copying));

        copyingThread.start();
        pastingThread.start();
        statusThread.start();
    }
}
