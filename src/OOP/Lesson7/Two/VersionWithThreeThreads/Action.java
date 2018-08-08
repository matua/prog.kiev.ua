package OOP.Lesson7.Two.VersionWithThreeThreads;
/*
Created by matua on 08.08.2018 at 19:52
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Action {
    private byte[] buffer;
    private double totalReadBytes;
    private File original;
    private long fileSize;
    private int readBytes;
    private boolean turn = false;
    private boolean stop = false;
    private boolean printStatus = false;

    public Action(File original) {
        this.original = original;
        totalReadBytes = 0;
        fileSize = original.length();
        buffer = new byte[1024 * 10];
    }

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
            readBytes = fis.read(buffer);
            turn = true;
            totalReadBytes += readBytes;
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
            fos.write(buffer, 0, readBytes);
            printStatus = true;
            turn = false;
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printStatus() {
        while (!printStatus) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        double percentage = totalReadBytes / fileSize * 100;
        System.out.printf("%.2f%%\n", percentage);
        notifyAll();
        printStatus = false;
    }
}
