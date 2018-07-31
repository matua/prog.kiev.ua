package OOP.Lesson7.One.ExecutorServiceSolution;
/*
Created by matua on 30.07.2018 at 22:51
*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Port {
    public static void main(String[] args) {
        ExecutorService port = Executors.newFixedThreadPool(2);

        port.submit(new Ship("Avrora", 10));
        port.submit(new Ship("Pilgrim", 10));
        port.submit(new Ship("Arizona", 10));

        port.shutdown();

    }
}
