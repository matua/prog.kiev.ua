package OOP.Lesson7.Two;
/*
Created by matua on 05.08.2018 at 17:41
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting implements Runnable {
    Action action;
    File copy;

    public FileWriting(Action action, File copy) {
        this.action = action;
        this.copy = copy;
    }

    @Override
    public void run() {
        while (!action.isStop()) {
            try(FileOutputStream fos = new FileOutputStream(copy, true)) {
                action.pasteFile(fos);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
