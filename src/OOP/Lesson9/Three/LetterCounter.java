package OOP.Lesson9.Three;
/*
Created by matua on 11.08.2018 at 17:43
*/

public class LetterCounter {
    private char aChar;
    private int repetitions;

    public LetterCounter(char aChar, int repetitions) {
        this.aChar = aChar;
        this.repetitions = repetitions;
    }

    public char getaChar() {
        return aChar;
    }

    public void setaChar(char aChar) {
        this.aChar = aChar;
    }

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }
}
