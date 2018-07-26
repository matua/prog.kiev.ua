package OOP.Lesson6.Five;
/*
Created by matua on 26.07.2018 at 19:46
*/

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class FileWatcherThread implements Runnable {
    File folder;
    File[] folderState;
    int counterOfAllowedChanges;

    public FileWatcherThread(File folder) {
        this.folder = folder;
        folderState = folder.listFiles();
        counterOfAllowedChanges = 0;
    }

    public File getFolder() {
        return folder;
    }


    private String getFolderInf() {
        boolean spotted = false;
        StringBuilder result = new StringBuilder();
        File[] currentFolderState = folder.listFiles();
//        if number of folder and files in the folder remains unchanged
        if (Arrays.equals(folderState, currentFolderState)) {
            result.append("No changes spotted");
        } else if (currentFolderState.length < folderState.length) {
            counterOfAllowedChanges++;
            for (int i = 0; i < folderState.length; i++) {
                for (int j = 0; j < currentFolderState.length; j++) {
                    if (folderState[i].equals(currentFolderState[j])) {
                        spotted = true;
                        break;
                    }
                }
                if (!spotted) {
                    result.append(folderState[i].getName()).append(" was deleted!");
                } else {
                    spotted = false;
                }
            }
        } else {
            counterOfAllowedChanges++;
            for (int i = 0; i < currentFolderState.length; i++) {
                for (int j = 0; j < folderState.length; j++) {
                    if (currentFolderState[i].equals(folderState[j])) {
                        spotted = true;
                        break;
                    }
                }
                if (!spotted) {
                    result.append(currentFolderState[i].getName()).append(" was added!");
                } else {
                    spotted = false;
                }
            }
        }
        folderState = currentFolderState;
        return result.toString();
    }

    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy    hh:mm:ss");
        for (; counterOfAllowedChanges != 5; ) {
            System.out.println(simpleDateFormat.format(System.currentTimeMillis()));
            System.out.println(getFolderInf());
            System.out.println();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }

        }
        System.out.println("Only " + counterOfAllowedChanges + " actions are allowed");
    }
}