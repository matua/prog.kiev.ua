package OOP.Lesson12.One;
/*
Created by matua on 21.08.2018 at 17:08
*/

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class URLAvailability {
    public static void check(File file) {
        List<String> list = getURLsList(file);
        URL url = null;
        for (String u : list) {
            try {
                url = new URL(u);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                if (con.getResponseCode() >= 200 && con.getResponseCode() < 300) {
                    System.out.printf("%s is available\n", url.getHost());
                } else {
                    System.out.printf("%s is NOT available because %s\n", url.getHost(), con.getResponseMessage());
                }
            } catch (IOException e) {
                System.out.printf("%s is NOT available\n", url.getHost());
            }
        }
    }

    private static List<String> getURLsList(File file) {
        List<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while (br.ready()) {
                list.add(br.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
