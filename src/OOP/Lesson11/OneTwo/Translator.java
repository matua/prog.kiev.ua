package OOP.Lesson11.OneTwo;
/*
Created by matua on 16.08.2018 at 20:14
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Translator {
    private static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("Ukraine", "Україна");
        dictionary.put("Russia", "Росія");
        dictionary.put("prosperity", "процвітання");
        dictionary.put("friends", "друзі");
        dictionary.put("root", "корінь");
        dictionary.put("because", "оскільки");
        dictionary.put("must", "повинен");
        dictionary.put("this", "це");
        dictionary.put("and", "i");
        dictionary.put("be", "бути");
        dictionary.put("is", "є");
        dictionary.put("of", "від");
        dictionary.put("it", "це");
        dictionary.put("the", "в");
    }

    public static Map<String, String> getDictionary() {
        return dictionary;
    }

    public static void translate(File english, File ukranian) throws IOException {
        StringBuilder text = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(english))) {
            while (bufferedReader.ready()) {
                text.append(bufferedReader.readLine());
            }
        }
        text.deleteCharAt(text.lastIndexOf("."));

        String[] textArray = text.toString().split(" ");

        StringBuilder translatedText = new StringBuilder();

        for (String string : textArray) {
            translatedText.append(dictionary.get(string)).append(" ");
        }
        translatedText.deleteCharAt(translatedText.lastIndexOf(" "));
        translatedText.append(".");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ukranian))) {
            bufferedWriter.write(translatedText.toString());
        }
    }

    public static void addWord(String english, String ukranian) {
        dictionary.put(english, ukranian);
    }

    public static void saveDictionary(File dictionaryS) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(dictionaryS))) {
            oos.writeObject(dictionary);
        }
    }

    public static Map<String, String> loadDictionary(File dictionaryS) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(dictionaryS))) {
            dictionary = (Map<String, String>) ois.readObject();
            return dictionary;
        }
    }
}
