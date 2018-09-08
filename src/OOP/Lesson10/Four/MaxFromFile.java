package OOP.Lesson10.Four;

//Created by matua on 12.08.2018 at 10:52


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;


public class MaxFromFile {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("/users/matua/Downloads/numbers.txt"))
                .map(n -> n.toUpperCase())
                .flatMapToInt(n -> n.chars())
                .mapToObj((n) -> (Character.valueOf((char) n)))
                .map(n -> (int) n)
                .max(Comparator.comparingInt(a -> a))
                .ifPresent(integer -> System.out.println(integer));
    }
}
