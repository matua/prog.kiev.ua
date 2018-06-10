package JavaStart.Lesson7.Level2;
/*
Created by matua on 10.06.2018 at 11:58
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input first integer and press ENTER.");
        int n = scanner.nextInt();
        System.out.println("Please input second integer and press ENTER.");
        int m = scanner.nextInt();
        System.out.format("The Hamming distance betweem %d and %d is %d", n, m, hammingDistance(n,m));
    }

    public static int hammingDistance(int n, int m) {
        int counter = 0;
        int compareN;
        int compareM;
        for (;((n != 0) || (m != 0));) {
            compareN = n % 2;
            n /= 2;
            compareM = m % 2;
            m /= 2;
            if (compareN != compareM) {
                counter++;
            }
        }
        return counter;
    }
}
