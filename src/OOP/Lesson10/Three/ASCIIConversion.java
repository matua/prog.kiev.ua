package OOP.Lesson10.Three;
/*
Created by matua on 12.08.2018 at 10:38
*/

import java.util.ArrayList;
import java.util.List;

public class ASCIIConversion {
    public static void main(String[] args) {
        System.out.println(convertToASCII("Выполняет код, обозначаемый указанным действием, для каждого элемента из вызываю" +
                "щего потока данных. (Это оконечная операция.)"));
    }

    public static List<Integer> convertToASCII(String text) {
        List<Integer> asciiList = new ArrayList<>();
        text
                .chars()
                .forEach(v -> asciiList.add(v));
        return asciiList;
    }

}
