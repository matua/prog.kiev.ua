package OOP.Lesson5.One;
/*
Created by matua on 09.07.2018 at 18:50
*/

import java.io.*;

public class DocCopier {
    public static void copy(File sourceDirectory, File destinationDirectory) throws IOException {
        File[] docFiles = sourceDirectory.listFiles(pathname -> {
            if ((pathname.getName().endsWith(".docx")) || (pathname.getName().endsWith(".DOCX"))) {
                return true;
            } else {
                return false;
            }
        });

        for (File file : docFiles) {
            File fileToCopy = new File(destinationDirectory + "/" + file.getName());
            fileToCopy.createNewFile();
            copyFile(file, fileToCopy);
        }
    }

    private static void copyFile(File in, File out) throws IOException {
        byte[] buffer = new byte[1024 * 1024];
        int readByte = 0;
        try (FileInputStream fileInputStream = new FileInputStream(in);
             FileOutputStream fileOutputStream = new FileOutputStream(out)) {
            while ((readByte = fileInputStream.read(buffer)) > 0) {
                fileOutputStream.write(buffer, 0, readByte);
            }
        }
    }
}
