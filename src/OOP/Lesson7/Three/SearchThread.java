package OOP.Lesson7.Three;
/*
Created by matua on 05.08.2018 at 20:21
*/

import java.io.File;

public class SearchThread implements Runnable {

    private File where;
    private String what;

    public SearchThread(String what, File where) {
        this.where = where;
        this.what = what;
    }

    @Override
    public void run() {
//        System.out.println(Thread.currentThread());
        search(where);
    }

    private void search(File where) {
        File[] files = where.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                search(file);
            }
            if (file.getName().equals(what)) {
                System.out.println(file);
            }
        }
    }
}
