package OOP.Lesson9.One;
/*
Created by matua on 09.08.2018 at 21:06
*/

import java.util.ArrayList;
import java.util.List;

public class TestingLists {
    public static void someStrangeMethod() {
        List<Integer> someList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            someList.add(i);
        }

        for (int i = 0; i <= 1; i++) {
            someList.remove(someList.indexOf(i));
        }

        System.out.println(someList);
    }

    public static void main(String[] args) {
        someStrangeMethod();
    }
}

