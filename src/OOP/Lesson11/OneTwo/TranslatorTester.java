package OOP.Lesson11.OneTwo;
/*
Created by matua on 16.08.2018 at 20:49
*/

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TranslatorTester {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Translator.translate(new File("/Users/matua/Downloads/English.in"), new File("/Users/matua/Downloads/Ukrainian.out"));

//        Translator.addWord("peace","мир");
//        Translator.addWord("friendship","дружба");
//        Translator.addWord("chewing-gum","жувальна гумка");
        Translator.loadDictionary(new File("/Users/matua/Downloads/dictionary.dic"));

        Translator.translate(new File("/Users/matua/Downloads/English2.in"), new File("/Users/matua/Downloads/Ukrainian2.out"));

//        Translator.saveDictionary(new File("/Users/matua/Downloads/dictionary.dic"));
    }
}
