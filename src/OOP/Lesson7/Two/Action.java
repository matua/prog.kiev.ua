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
    private long fileSize;
    private volatile int readFiles;
    private boolean turn = false;
    private boolean print = false;
    private boolean stop = false;

    public Action(File original) {
        totalReadFiles = 0;
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
            readFiles = fis.read(buffer);
            turn = true;
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
            print = true;
            notifyAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void printStatus() {
        while (!print) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            totalReadFiles += readFiles;
            double percentage = totalReadFiles / fileSize * 100;
            System.out.printf("%.2f%%\n", percentage);
            print = false;
            turn = false;
            notifyAll();
        }
    }
}
