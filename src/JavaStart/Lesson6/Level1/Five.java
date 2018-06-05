package JavaStart.Lesson6.Level1;
/*
Created by matua on 05.06.2018 at 22:23
*/

public class Five {
    public static void main(String[] args) {
        System.out.println(countWords("How many words are in this sentence?"));

    }

    public static int countWords(String line) {
        int spaceQuantity = 0;
        for (char ch : line.toCharArray()) {
            if (ch == ' ') {
                spaceQuantity++;
            }
        }
        return ++spaceQuantity;
    }
}
