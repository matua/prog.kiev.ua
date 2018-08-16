package OOP.Lesson11.Three;
/*
Created by matua on 16.08.2018 at 22:12
*/

public class MapCounterTester {
    public static void main(String[] args) {
        Double[]arrayOfDoubles = {4.5, 2.342, 4.5, 3.5, 3.5, 2.342, 4.5, 4.23435, 0D};
        System.out.println(MapCounter.count(arrayOfDoubles));

        Integer[]arrayOfIntegers = {4, 2, 4, 3, 3, 2, 4, 4, 0};
        System.out.println(MapCounter.count(arrayOfIntegers));
    }
}
