package OOP.Lesson7.One.NonExecutorServiceSolutions;
/*
Created by matua on 29.07.2018 at 17:48
*/

public class Ship implements Runnable {

    String name;
    Docks docks;
    int boxes;

    public Ship(String name, Docks docks, int boxes) {
        this.name = name;
        this.docks = docks;
        this.boxes = boxes;
    }


    @Override
    public void run() {
        while (boxes > 0) {
            if (docks.getNumberOfDocks() > 0) {
                docks.useDock();
                int tempBoxes = boxes;
                for (int j = 0; j < tempBoxes; j++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    boxes--;
                    System.out.println(boxes + " left for " + name);
                }
            } else {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("No docks available for " + name);
            }
        }
        docks.releaseDock();
    }
}

