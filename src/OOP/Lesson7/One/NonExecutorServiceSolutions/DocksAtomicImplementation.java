package OOP.Lesson7.One.NonExecutorServiceSolutions;
/*
Created by matua on 30.07.2018 at 21:47
*/

import java.util.concurrent.atomic.AtomicInteger;

public class DocksAtomicImplementation {
    String name;
    private AtomicInteger numberOfDocks = new AtomicInteger(2);

    public DocksAtomicImplementation(String name) {
        this.name = name;
    }

    public AtomicInteger getNumberOfDocks() {
        return numberOfDocks;
    }

    public void setNumberOfDocks(AtomicInteger numberOfDocks) {
        this.numberOfDocks = numberOfDocks;
    }

    public synchronized void useDock(){
        numberOfDocks = new AtomicInteger(numberOfDocks.decrementAndGet());
    }

    public synchronized void releaseDock(){
        numberOfDocks = new AtomicInteger(numberOfDocks.incrementAndGet());
    }
}
