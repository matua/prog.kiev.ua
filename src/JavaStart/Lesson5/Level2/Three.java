package JavaStart.Lesson5.Level2;
/*
Created by matua on 02.06.2018 at 9:39
*/

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        double amount;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("How much money do you have?");
            amount = scanner.nextDouble();
            if ((amount > 0) && (amount < 1_000_000_000)) {
                break;
            } else {
                System.out.println("You money has to be more than zero and less than a billion.\n");
            }
        }

        int main;
        int decimal;

        main = (int) amount;
        decimal = (int) ((amount - main) * 100);

        System.out.println("main = " + main);
        System.out.println("decimal = " + decimal);
        int[] array;
        int groups;

        if (main < 10) {
            array = new int[1];
        } else if ((main > 10) && (main < 100)) {
            array = new int[2];
        } else if ((main > 101) && (main < 1_000)) {
            array = new int[3];
        } else if ((main > 1_001) && (main < 10_000)) {
            array = new int[4];
        } else if ((main > 10_001) && (main < 100_000)) {
            array = new int[5];
        } else if ((main > 100_001) && (main < 1_000_000)) {
            array = new int[6];
        } else if ((main > 1_000_001) && (main < 10_000_000)) {
            array = new int[7];
        } else if ((main > 10_000_001) && (main < 100_000_000)) {
            array = new int[8];
        } else {
            array = new int[9];
        }

//        for (int i = array.length - 1; i >= 0; i--) {
//                int number = main % 10;
//                main /= 10;
//                array[i] = number;
//        }

        String mainString = "";

        main = (int) amount;

        int[] group = new int[0];


        if ((array.length > 0) && (array.length < 4)) {
            group = new int[1];
            group[0] = main;
        } else if ((array.length >= 4) && (array.length < 7)) {
            group = new int[2];
            group[0] = main / 1_000;
            group[1] = main % 1_000;
        } else if ((array.length >= 7) && (array.length < 10)) {
            group = new int[3];
            group[0] = main / 1_000_000;
            group[1] = main / 1_000 % 1000;
            group[2] = main % 1_000;
        }

        System.out.println(Arrays.toString(group));

        int[] subGroup = new int[0];

        for (int digits : group) {
            if ((digits > 0) && (digits < 10)) {
                subGroup = new int[1];
                subGroup[0] = digits;
            } else if ((digits > 10) && (digits < 100)) {
                subGroup = new int[2];
                subGroup[0] = digits / 10;
                subGroup[1] = digits % 10;
            } else if ((digits >= 100) && (digits < 1000)) {
                subGroup = new int[3];
                subGroup[0] = digits / 100;
                subGroup[1] = digits / 10 % 10;
                subGroup[2] = digits % 10;
            }

            if (subGroup.length == 1) {
                switch (subGroup[0]) {
                    case 1:
                        System.out.print("one ");
                        break;
                    case 2:
                        System.out.print("two ");
                        break;
                    case 3:
                        System.out.print("three ");
                        break;
                    case 4:
                        System.out.print("four ");
                        break;
                    case 5:
                        System.out.print("five ");
                        break;
                    case 6:
                        System.out.print("six ");
                        break;
                    case 7:
                        System.out.print("seven ");
                        break;
                    case 8:
                        System.out.print("eight ");
                        break;
                    case 9:
                        System.out.print("nine ");
                }
            } else if (subGroup.length == 2) {
                if (digits >= 10 && digits < 20) {
                    switch (subGroup[0]) {
                        case 10:
                            System.out.print("ten ");
                            break;
                        case 11:
                            System.out.print("eleven ");
                            break;
                        case 12:
                            System.out.print("twelve ");
                            break;
                        case 13:
                            System.out.print("thirteen ");
                            break;
                        case 14:
                            System.out.print("fourteen ");
                            break;
                        case 15:
                            System.out.print("fifteen ");
                            break;
                        case 16:
                            System.out.print("sixteen ");
                            break;
                        case 17:
                            System.out.print("seventeen ");
                            break;
                        case 18:
                            System.out.print("eighteen ");
                            break;
                        case 19:
                            System.out.print("nineteen ");
                    }
                } else {
                    System.out.println("subGroup = " + subGroup[0]);
                    switch (subGroup[0]) {

                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("forty ");
                            break;
                        case 5:
                            System.out.print("fifty ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                    }
                    switch (subGroup[1]) {
                        case 1:
                            System.out.print("one ");
                            break;
                        case 2:
                            System.out.print("two ");
                            break;
                        case 3:
                            System.out.print("three ");
                            break;
                        case 4:
                            System.out.print("four ");
                            break;
                        case 5:
                            System.out.print("five ");
                            break;
                        case 6:
                            System.out.print("six ");
                            break;
                        case 7:
                            System.out.print("seven ");
                            break;
                        case 8:
                            System.out.print("eight ");
                            break;
                        case 9:
                            System.out.print("nine ");
                    }

                }

            } else {
                switch (subGroup[0]) {
                    case 1:
                        System.out.print("one hundred and ");
                        break;
                    case 2:
                        System.out.print("two hundred and ");
                        break;
                    case 3:
                        System.out.print("three hundred and ");
                        break;
                    case 4:
                        System.out.print("four hundred and ");
                        break;
                    case 5:
                        System.out.print("five hundred and ");
                        break;
                    case 6:
                        System.out.print("six hundred and ");
                        break;
                    case 7:
                        System.out.print("seven hundred and ");
                        break;
                    case 8:
                        System.out.print("eight hundred and ");
                        break;
                    case 9:
                        System.out.print("nine hundred and ");
                }
                if (digits >= 10 && digits < 20) {
                    switch (subGroup[0]) {
                        case 10:
                            System.out.print("ten ");
                            break;
                        case 11:
                            System.out.print("eleven ");
                            break;
                        case 12:
                            System.out.print("twelve ");
                            break;
                        case 13:
                            System.out.print("thirteen ");
                            break;
                        case 14:
                            System.out.print("fourteen ");
                            break;
                        case 15:
                            System.out.print("fifteen ");
                            break;
                        case 16:
                            System.out.print("sixteen ");
                            break;
                        case 17:
                            System.out.print("seventeen ");
                            break;
                        case 18:
                            System.out.print("eighteen ");
                            break;
                        case 19:
                            System.out.print("nineteen ");
                    }
                } else {
                    switch (subGroup[0]) {
                        case 2:
                            System.out.print("twenty ");
                            break;
                        case 3:
                            System.out.print("thirty ");
                            break;
                        case 4:
                            System.out.print("forty ");
                            break;
                        case 5:
                            System.out.print("fifty ");
                            break;
                        case 6:
                            System.out.print("sixty ");
                            break;
                        case 7:
                            System.out.print("seventy ");
                            break;
                        case 8:
                            System.out.print("eighty ");
                            break;
                        case 9:
                            System.out.print("ninety ");
                    }
                    switch (subGroup[1]) {
                        case 1:
                            System.out.print("one ");
                            break;
                        case 2:
                            System.out.print("two ");
                            break;
                        case 3:
                            System.out.print("three ");
                            break;
                        case 4:
                            System.out.print("four ");
                            break;
                        case 5:
                            System.out.print("five ");
                            break;
                        case 6:
                            System.out.print("six ");
                            break;
                        case 7:
                            System.out.print("seven ");
                            break;
                        case 8:
                            System.out.print("eight ");
                            break;
                        case 9:
                            System.out.print("nine ");
                    }
                }
            }


//        if ((groupThree == 0) && (groupOne != 0) && (groupTwo != 0)) {
//
//        }


//        System.out.println(Arrays.toString(array));


        }
    }
}
