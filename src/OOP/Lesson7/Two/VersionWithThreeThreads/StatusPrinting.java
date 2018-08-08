package OOP.Lesson7.Two.VersionWithThreeThreads;
/*
Created by matua on 08.08.2018 at 19:58
*/

public class StatusPrinting implements Runnable {
    private Action action;

    public StatusPrinting(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        while (!action.isStop()) {
            action.printStatus();
        }
    }
}
