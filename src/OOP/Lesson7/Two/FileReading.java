package OOP.Lesson7.Two;
/*
Created by matua on 05.08.2018 at 17:41
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReading implements Runnable {

    private Action action;
    private File original;

    public FileReading(Action action, File original) {
        this.action = action;
        this.original = original;
    }

    @Override
    public void run() {
        try (FileInputStream fis = new FileInputStream(original)) {
            while (fis.available() > 0) {
                action.copyFile(fis);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        action.setStop(true);
    }
}
