package OOP.Lesson7.Two;
/*
Created by matua on 05.08.2018 at 21:42
*/

public class Status implements Runnable {
    private Action action;

    public Status(Action action) {
        this.action = action;
    }

    @Override
    public void run() {
        while (!action.isStop()) {
            {
                action.printStatus();
            }
        }
    }
}
