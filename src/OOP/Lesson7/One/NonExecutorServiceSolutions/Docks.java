package OOP.Lesson7.One.NonExecutorServiceSolutions;
/*
Created by matua on 29.07.2018 at 17:49
*/

public class Docks {
    String name;
    private volatile int numberOfDocks = 2;

    public Docks(String name) {
        this.name = name;
    }

    public int getNumberOfDocks() {
        return numberOfDocks;
    }

    public void setNumberOfDocks(int numberOfDocks) {
        this.numberOfDocks = numberOfDocks;
    }

    public synchronized void useDock(){
        numberOfDocks--;
    }

    public synchronized void releaseDock(){
        numberOfDocks++;
    }
}
