package OOP.Lesson11.Three;
/*
Created by matua on 16.08.2018 at 21:47
*/

import java.util.*;

public class MapCounter {
    public static <T extends Number> Map<T, Integer> count(T [] array) {
        Map<T, Integer> map = new HashMap<>();
        for (T x : array) {
            map.put(x, map.get(x) == null ? 1 : map.get(x) + 1);
        }
        return map;
    }
}
