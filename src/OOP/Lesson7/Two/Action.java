package OOP.Lesson7.Two;
/*
Created by matua on 05.08.2018 at 17:42
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Action {
    private byte[] buffer;
    private double totalReadFiles;
    File original;
    long fileSize;

    public Action(File original) {
        this.original = original;
        totalReadFiles = 0;
        fileSize = original.length();
        buffer = new byte[1024 * 10];
    }

    private boolean turn = false;
    private boolean stop = false;

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public synchronized void copyFile(FileInputStream fis) {
        while (turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            int readFiles = fis.read(buffer);
            turn = true;
            totalReadFiles += readFiles;
            double percentage = totalReadFiles / fileSize * 100;
                System.out.printf("%.2f%%\n", percentage);
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void pasteFile(FileOutputStream fos) {
        while (!turn) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            fos.write(buffer);
            turn = false;
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
