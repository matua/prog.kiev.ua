package OOP.Lesson9.Four;
/*
Created by matua on 11.08.2018 at 18:15
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class StrangeQueue {
    public static void main(String[] args) {
        int colas = 0;

        Deque<String> strangeQueue = new LinkedList<>();

        strangeQueue.add("Sheldon");
        strangeQueue.add("Leonard");
        strangeQueue.add("Volovitc");
        strangeQueue.add("Kutrapalli");
        strangeQueue.add("Penny");

        System.out.println("Before cola: " + strangeQueue + System.lineSeparator());

        System.out.println("Please input the number of colas");

        try (BufferedReader bf = new BufferedReader(
                new InputStreamReader(System.in))) {
            colas = Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < colas; i++) {
            String temp = strangeQueue.removeFirst();
            strangeQueue.addLast(temp);
            strangeQueue.addLast(temp);
        }
        System.out.println("After cola: " + strangeQueue + System.lineSeparator());
    }
}
