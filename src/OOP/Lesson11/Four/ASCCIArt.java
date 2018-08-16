package OOP.Lesson11.Four;
/*
Created by matua on 16.08.2018 at 22:35
*/

import java.util.HashMap;
import java.util.Map;

public class ASCCIArt {
    private static Map<Character, String> alphabet = new HashMap<>();

    static {
        alphabet.put('a', "         \n" +
                "         \n" +
                "         \n" +
                " 8888b.  \n" +
                "    \"88b \n" +
                ".d888888 \n" +
                "888  888 \n" +
                "\"Y888888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('b', "888      \n" +
                "888      \n" +
                "888      \n" +
                "88888b.  \n" +
                "888 \"88b \n" +
                "888  888 \n" +
                "888 d88P \n" +
                "88888P\"  \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('c', "         \n" +
                "         \n" +
                "         \n" +
                " .d8888b \n" +
                "d88P\"    \n" +
                "888      \n" +
                "Y88b.    \n" +
                " \"Y8888P \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('d', "     888 \n" +
                "     888 \n" +
                "     888 \n" +
                " .d88888 \n" +
                "d88\" 888 \n" +
                "888  888 \n" +
                "Y88b 888 \n" +
                " \"Y88888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('e', "         \n" +
                "         \n" +
                "         \n" +
                " .d88b.  \n" +
                "d8P  Y8b \n" +
                "88888888 \n" +
                "Y8b.     \n" +
                " \"Y8888  \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('f', " .d888 \n" +
                "d88P\"  \n" +
                "888    \n" +
                "888888 \n" +
                "888    \n" +
                "888    \n" +
                "888    \n" +
                "888    \n" +
                "       \n" +
                "       \n" +
                "      ");
        alphabet.put('g', "         \n" +
                "         \n" +
                "         \n" +
                " .d88b.  \n" +
                "d88P\"88b \n" +
                "888  888 \n" +
                "Y88b 888 \n" +
                " \"Y88888 \n" +
                "     888 \n" +
                "Y8b d88P \n" +
                " \"Y88P\" ");
        alphabet.put('h', "\n" +
                "888      \n" +
                "888      \n" +
                "888      \n" +
                "88888b.  \n" +
                "888 \"88b \n" +
                "888  888 \n" +
                "888  888 \n" +
                "888  888 \n" +
                "         \n" +
                "         \n" +
                "         \n");
        alphabet.put('i', "\n" +
                "d8b \n" +
                "Y8P \n" +
                "    \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "    \n" +
                "    \n" +
                "    \n");
        alphabet.put('j', "   d8b \n" +
                "   Y8P \n" +
                "       \n" +
                "  8888 \n" +
                "  \"888 \n" +
                "   888 \n" +
                "   888 \n" +
                "   888 \n" +
                "   888 \n" +
                "  d88P \n" +
                "888P\" ");
        alphabet.put('k', "888      \n" +
                "888      \n" +
                "888      \n" +
                "888  888 \n" +
                "888 .88P \n" +
                "888888K  \n" +
                "888 \"88b \n" +
                "888  888 \n" +
                "         \n" +
                "         \n" +
                "       ");
        alphabet.put('l', "\n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "    \n" +
                "    \n" +
                "    \n");
        alphabet.put('m', "              \n" +
                "              \n" +
                "              \n" +
                "88888b.d88b.  \n" +
                "888 \"888 \"88b \n" +
                "888  888  888 \n" +
                "888  888  888 \n" +
                "888  888  888 \n" +
                "              \n" +
                "              \n" +
                "             ");
        alphabet.put('n', "         \n" +
                "         \n" +
                "         \n" +
                "88888b.  \n" +
                "888 \"88b \n" +
                "888  888 \n" +
                "888  888 \n" +
                "888  888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('o', "         \n" +
                "         \n" +
                "         \n" +
                " .d88b.  \n" +
                "d88\"\"88b \n" +
                "888  888 \n" +
                "Y88..88P \n" +
                " \"Y88P\"  \n" +
                "         \n" +
                "         \n" +
                "         ");
        alphabet.put('p', "         \n" +
                "         \n" +
                "         \n" +
                "88888b.  \n" +
                "888 \"88b \n" +
                "888  888 \n" +
                "888 d88P \n" +
                "88888P\"  \n" +
                "888      \n" +
                "888      \n" +
                "888    ");
        alphabet.put('q', "         \n" +
                "         \n" +
                "         \n" +
                " .d88888 \n" +
                "d88\" 888 \n" +
                "888  888 \n" +
                "Y88b 888 \n" +
                " \"Y88888 \n" +
                "     888 \n" +
                "     888 \n" +
                "     888");
        alphabet.put('r', "        \n" +
                "        \n" +
                "        \n" +
                "888d888 \n" +
                "888P\"   \n" +
                "888     \n" +
                "888     \n" +
                "888     \n" +
                "        \n" +
                "        \n" +
                "        ");
        alphabet.put('s', "         \n" +
                "         \n" +
                "         \n" +
                ".d8888b  \n" +
                "88K      \n" +
                "\"Y8888b. \n" +
                "     X88 \n" +
                " 88888P' \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('t', "888    \n" +
                "888    \n" +
                "888    \n" +
                "888888 \n" +
                "888    \n" +
                "888    \n" +
                "Y88b.  \n" +
                " \"Y888 \n" +
                "       \n" +
                "       \n" +
                "      ");
        alphabet.put('u', "         \n" +
                "         \n" +
                "         \n" +
                "888  888 \n" +
                "888  888 \n" +
                "888  888 \n" +
                "Y88b 888 \n" +
                " \"Y88888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('v', "         \n" +
                "         \n" +
                "         \n" +
                "888  888 \n" +
                "888  888 \n" +
                "Y88  88P \n" +
                " Y8bd8P  \n" +
                "  Y88P   \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('w', "              \n" +
                "              \n" +
                "              \n" +
                "888  888  888 \n" +
                "888  888  888 \n" +
                "888  888  888 \n" +
                "Y88b 888 d88P \n" +
                " \"Y8888888P\"  \n" +
                "              \n" +
                "              \n" +
                "            ");
        alphabet.put('x', "         \n" +
                "         \n" +
                "         \n" +
                "888  888 \n" +
                "`Y8bd8P' \n" +
                "  X88K   \n" +
                ".d8\"\"8b. \n" +
                "888  888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put('y', "         \n" +
                "         \n" +
                "         \n" +
                "888  888 \n" +
                "888  888 \n" +
                "888  888 \n" +
                "Y88b 888 \n" +
                " \"Y88888 \n" +
                "     888 \n" +
                "Y8b d88P \n" +
                " \"Y88P\" ");
        alphabet.put('z', "         \n" +
                "         \n" +
                "         \n" +
                "88888888 \n" +
                "   d88P  \n" +
                "  d88P   \n" +
                " d88P    \n" +
                "88888888 \n" +
                "         \n" +
                "         \n" +
                "        ");
        alphabet.put(' ', "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      \n" +
                "      ");
        alphabet.put('.', "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "d8b \n" +
                "Y8P \n" +
                "    \n" +
                "    \n" +
                "   ");
        alphabet.put(',', "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "    \n" +
                "d8b \n" +
                "88P \n" +
                "8P  \n" +
                "\"   \n" +
                "  ");
        alphabet.put('!', "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "888 \n" +
                "Y8P \n" +
                " \"  \n" +
                "888 \n" +
                "    \n" +
                "    \n" +
                "   ");
        alphabet.put('?', " .d8888b.  \n" +
                "d88P  Y88b \n" +
                "     .d88P \n" +
                "   .d88P\"  \n" +
                "   888\"    \n" +
                "   888     \n" +
                "           \n" +
                "   888     \n" +
                "           \n" +
                "           \n" +
                "          ");
    }

    public static void convert(String text) {
        char[] characters = text.toCharArray();
        for (int i = 0; i < splitLetter(alphabet.get('a')).length; i++) {
            for (char ch : characters) {
                System.out.print(splitLetter(alphabet.get(ch))[i]);
            }
            System.out.print(System.lineSeparator());
        }
    }

    public static String[] splitLetter(String ascciLetter) {
        return ascciLetter.split("\n");
    }
}
