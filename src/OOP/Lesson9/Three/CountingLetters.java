package OOP.Lesson9.Three;
/*
Created by matua on 11.08.2018 at 12:41
*/

import java.io.*;
import java.util.*;

public class CountingLetters {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the location of the file.");

        String text = "";

        try (BufferedReader br = new BufferedReader(
                new FileReader(
                        new File(
                                new Scanner(System.in).nextLine())))) {
            while (br.ready()) {
                text += br.readLine();
            }
        }

        //Building an alphabet
        List<LetterCounter> alphabet = new ArrayList<>();
        alphabet.add(new LetterCounter('a', 0));
        alphabet.add(new LetterCounter('b', 0));
        alphabet.add(new LetterCounter('c', 0));
        alphabet.add(new LetterCounter('d', 0));
        alphabet.add(new LetterCounter('e', 0));
        alphabet.add(new LetterCounter('f', 0));
        alphabet.add(new LetterCounter('g', 0));
        alphabet.add(new LetterCounter('h', 0));
        alphabet.add(new LetterCounter('i', 0));
        alphabet.add(new LetterCounter('j', 0));
        alphabet.add(new LetterCounter('k', 0));
        alphabet.add(new LetterCounter('l', 0));
        alphabet.add(new LetterCounter('m', 0));
        alphabet.add(new LetterCounter('n', 0));
        alphabet.add(new LetterCounter('o', 0));
        alphabet.add(new LetterCounter('p', 0));
        alphabet.add(new LetterCounter('r', 0));
        alphabet.add(new LetterCounter('s', 0));
        alphabet.add(new LetterCounter('t', 0));
        alphabet.add(new LetterCounter('u', 0));
        alphabet.add(new LetterCounter('v', 0));
        alphabet.add(new LetterCounter('w', 0));
        alphabet.add(new LetterCounter('x', 0));
        alphabet.add(new LetterCounter('y', 0));
        alphabet.add(new LetterCounter('z', 0));

        for (char letter : text.toCharArray()) {
            for(LetterCounter alpha : alphabet) {
                if (Character.toLowerCase(letter) == alpha.getaChar()) {
                    alpha.setRepetitions(alpha.getRepetitions() + 1);
                }
            }
        }

        alphabet.sort((o1, o2) -> {
            if (o1.getRepetitions() < o2.getRepetitions()) {
                return 1;
            } else if (o1.getaChar() > o2.getaChar()) {
                return -1;
            } else {
                return 0;
            }
        });

        for (LetterCounter alpha : alphabet) {
            System.out.printf("%s - %d\n", alpha.getaChar(), alpha.getRepetitions());
        }
    }
}
