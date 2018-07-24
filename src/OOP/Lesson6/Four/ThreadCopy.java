package OOP.Lesson6.Four;
/*
Created by matua on 22.07.2018 at 19:57
*/

import java.io.*;

public class ThreadCopy implements Runnable {
    File[] tenFiles;
    File folderToCopy;

    public ThreadCopy(File[] tenFiles, File folderToCopy) {
        this.tenFiles = tenFiles;
        this.folderToCopy = folderToCopy;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (File file : tenFiles) {
            try {
                if (!file.isDirectory()) {
                    File fileToCopy = new File(folderToCopy + "/" + file.getName());
                    fileToCopy.createNewFile();
                    copy(file, fileToCopy);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void copy(File fileFrom, File fileTo) throws IOException {
        byte[] dataBuffer = new byte[1024 * 1024];
        int bytesRead;
        try (FileInputStream fis = new FileInputStream(fileFrom);
             FileOutputStream fos = new FileOutputStream(fileTo)) {
            while ((bytesRead = fis.read(dataBuffer)) > 0) {
                fos.write(dataBuffer, 0, bytesRead);
            }
        }

    }
}