package OOP.Lesson11.One;
/*
Created by matua on 16.08.2018 at 20:49
*/

import java.io.File;
import java.io.IOException;

public class TranslatorTester {
    public static void main(String[] args) throws IOException {
        Translator.translate(new File("/Users/matua/Downloads/English.in"), new File("/Users/matua/Downloads/Ukrainian.out"));
    }
}
