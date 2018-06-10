package JavaStart.Lesson7.Level1;
/*
Created by matua on 09.06.2018 at 22:11
*/

import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String binaryNumber = scanner.nextLine();
        
        char [] arrayOfBits = binaryNumber.toCharArray();
        
        int counter = 0;
        int result = 0;

        for (int i = arrayOfBits.length - 1; i > 0 ; i--) {
            if (arrayOfBits[i] == '1') {
                result += Math.pow(2, counter);
            }
            counter++;
        }

        System.out.println("Result = " + result);
    }
}
