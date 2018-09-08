//package JavaStart.Lesson8.Level2;
///*
//Created by matua on 10.06.2018 at 21:48
//*/
//
//import java.io.*;
//
//public class Two {
//    public static void main(String[] args) {
//        File file = new File("countFigures.txt");
//        StringBuilder stringBuilder = new StringBuilder();
//        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
//            while(reader.ready()) {
//                stringBuilder.append(reader.readLine());
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        char[] text = stringBuilder.toString().toCharArray();
//
//        char [] array = {'a', 'b', 'c', 'd', 'e', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l' ,'m', 'n', 'o', 'p', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
//
//        for (char ch : text) {
//            if (ch == 'a' || ch == 'A') {
//                array[]
//            }
//        }
//    }
//}
