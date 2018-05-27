package JavaStart.Lesson3.Level1;
/*
Created by matua on 27.05.2018 at 17:28
*/

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int apartmentNumber;
        int entrance;
        int floor;

        System.out.println("Пожалуйста, введите номер квартиры.");
        apartmentNumber = scanner.nextInt();

        if ((apartmentNumber >= 1) && (apartmentNumber < 37)) {
            entrance = 1;
            if (apartmentNumber <= 4) {
                floor = 1;
            } else if ((apartmentNumber >= 5) && (apartmentNumber <= 8)) {
                floor = 2;
            } else if ((apartmentNumber >= 9) && (apartmentNumber <= 12)) {
                floor = 3;
            } else if ((apartmentNumber >= 13) && (apartmentNumber <= 16)) {
                floor = 4;
            } else if ((apartmentNumber >= 17) && (apartmentNumber <= 20)) {
                floor = 5;
            } else if ((apartmentNumber >= 21) && (apartmentNumber <= 24)) {
                floor = 6;
            } else if ((apartmentNumber >= 25) && (apartmentNumber <= 28)) {
                floor = 7;
            } else if ((apartmentNumber >= 29) && (apartmentNumber <= 32)) {
                floor = 8;
            } else {
                floor = 9;
            }
        } else if  ((apartmentNumber >= 37) && (apartmentNumber < 72)) {
            entrance = 2;
            if (apartmentNumber <= 40) {
                floor = 1;
            } else if ((apartmentNumber >= 41) && (apartmentNumber <= 44)) {
                floor = 2;
            } else if ((apartmentNumber >= 45) && (apartmentNumber <= 48)) {
                floor = 3;
            } else if ((apartmentNumber >= 49) && (apartmentNumber <= 52)) {
                floor = 4;
            } else if ((apartmentNumber >= 53) && (apartmentNumber <= 56)) {
                floor = 5;
            } else if ((apartmentNumber >= 57) && (apartmentNumber <= 60)) {
                floor = 6;
            } else if ((apartmentNumber >= 61) && (apartmentNumber <= 64)) {
                floor = 7;
            } else if ((apartmentNumber >= 65) && (apartmentNumber <= 68)) {
                floor = 8;
            } else {
                floor = 9;
            }
        } else if  ((apartmentNumber >= 73) && (apartmentNumber < 108)) {
            entrance = 3;
            if (apartmentNumber <= 76) {
                floor = 1;
            } else if ((apartmentNumber >=77) && (apartmentNumber <= 80)) {
                floor = 2;
            } else if ((apartmentNumber >= 81) && (apartmentNumber <= 84)) {
                floor = 3;
            } else if ((apartmentNumber >= 85) && (apartmentNumber <= 88)) {
                floor = 4;
            } else if ((apartmentNumber >= 89) && (apartmentNumber <= 92)) {
                floor = 5;
            } else if ((apartmentNumber >= 93) && (apartmentNumber <= 96)) {
                floor = 6;
            } else if ((apartmentNumber >= 97) && (apartmentNumber <= 100)) {
                floor = 7;
            } else if ((apartmentNumber >= 101) && (apartmentNumber <= 104)) {
                floor = 8;
            } else {
                floor = 9;
            }
        } else if  ((apartmentNumber >= 109) && (apartmentNumber <= 144)) {
            entrance = 4;
            if (apartmentNumber <= 112) {
                floor = 1;
            } else if ((apartmentNumber >= 113) && (apartmentNumber <= 116)) {
                floor = 2;
            } else if ((apartmentNumber >= 117) && (apartmentNumber <= 120)) {
                floor = 3;
            } else if ((apartmentNumber >= 121) && (apartmentNumber <= 124)) {
                floor = 4;
            } else if ((apartmentNumber >= 125) && (apartmentNumber <= 128)) {
                floor = 5;
            } else if ((apartmentNumber >= 129) && (apartmentNumber <= 132)) {
                floor = 6;
            } else if ((apartmentNumber >= 133) && (apartmentNumber <= 136)) {
                floor = 7;
            } else if ((apartmentNumber >= 137) && (apartmentNumber <= 140)) {
                floor = 8;
            } else {
                floor = 9;
            }
        } else {
            entrance = 0;
            floor = 0;
        }

        if (entrance != 0) {
            System.out.println("Квартира находится в подъезде №" + entrance + " и на этаже №" + floor + ".");
        } else {
            System.out.println("Такой квартиры в доме нет.");
        }



    }
}
