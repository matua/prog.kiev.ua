package JavaPro.Lesson_1;
/*
Created by matua on 28.08.2018 at 12:27
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;

public class Two {
    public static void main(String[] args) {
        Class<TextContainer> cls = TextContainer.class;

        SaveTo saveTo = cls.getAnnotation(SaveTo.class);

        try {
            cls.getDeclaredMethod("save", String.class).invoke(null,saveTo.whereTo());
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface SaveTo {
    String whereTo();
}

@SaveTo(whereTo = "/Users/matua/Downloads/file.txt")
class TextContainer {
    private static String text = "Some words";

    @Saver
    public static void save(String whereTo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(new File(whereTo)))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Saver {
}

