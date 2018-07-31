package OOP.Lesson7.One.ExecutorServiceSolution;
/*
Created by matua on 30.07.2018 at 22:48
*/

public class Ship implements Runnable {
    String name;
    int boxes;

    public Ship(String name, int boxes) {
        this.name = name;
        this.boxes = boxes;
    }

    @Override
    public void run() {
        int numberOfBoxes = boxes;
        for (int i = 0; i < numberOfBoxes; i++) {
        System.out.println(boxes + " boxes left for " + name);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        boxes--;
        }
    }
}
