package OOP.Lesson10.Two;
/*
Created by matua on 12.08.2018 at 9:04
*/

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
public class Two {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, -3, 2, 4, 0, -2, 4, 2, 5, -1);
        System.out.println(findSmallestModule(list));
    }

    public static int findSmallestModule(List<Integer> numbers) {
        int result = numbers.stream()
                .filter(v -> v != 0)
                .mapToInt(v -> v)
                .map(v -> Math.abs(v))
                .min().orElseThrow(NoSuchElementException::new);
        return result;
    }
}
