package JavaPro.Lesson_2.Two;
/*
Created by matua on 02.09.2018 at 12:00
*/


import com.google.gson.Gson;

import java.io.*;

public class JSONParsing {
    public static void main(String[] args) {
        File jsonFile = new File("/Users/matua/Downloads/json.txt");

        String json = "";

        try (BufferedReader br = new BufferedReader(new FileReader(jsonFile))) {
            while (br.ready()) {
                json += br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();

        BusinessCard businessCard = gson.fromJson(json, BusinessCard.class);
        System.out.println(businessCard);
    }
}
