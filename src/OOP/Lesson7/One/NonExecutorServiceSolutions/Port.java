package OOP.Lesson7.One.NonExecutorServiceSolutions;
/*
Created by matua on 29.07.2018 at 18:01
*/

import java.io.FileNotFoundException;

public class Port {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Volatile implementation:" + System.lineSeparator());

        Docks docks = new Docks("Pearl Harbour");

        Thread threadShip1 = new Thread(new Ship("Alaska", docks, 10));
        Thread threadShip2 = new Thread(new Ship("Duncan", docks, 10));
        Thread threadShip3 = new Thread(new Ship("Pilgrim", docks, 10));

        threadShip1.start();
        threadShip2.start();
        threadShip3.start();

        try {
            threadShip1.join();
            threadShip2.join();
            threadShip3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(System.lineSeparator() + "Atomic implementation" + System.lineSeparator());


        Thread threadShip4 = new Thread(new Ship("Aurora", docks, 10));
        Thread threadShip5 = new Thread(new Ship("Arabella", docks, 10));
        Thread threadShip6 = new Thread(new Ship("Arizona", docks, 10));

        threadShip4.start();
        threadShip5.start();
        threadShip6.start();
    }
}
