package OOP.Lesson12.Three;
/*
Created by matua on 23.08.2018 at 20:23
*/

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlToFileOfLinks {
    public static void searchForLinks(String urlName) {
        List<String> result = null;
        try {
            URL url = new URL(urlName);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            result = UrlSearch(readFromUrl(connection));
        } catch (IOException e) {
            System.out.println("Oh! URL is not valid!");
        }

        File file = new File(makeFileName(urlName));
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String link : result) {
                bw.write(link);
                bw.write(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFromUrl(HttpURLConnection connection) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        )) {
            while (br.ready()) {
                sb.append(br.readLine());
            }
        } catch (IOException e) {
            System.out.println("Oh. No connection!");
        }
        return sb.toString();
    }

    private static List<String> UrlSearch(String page) {
        List<String> urlList = new ArrayList<>();

        Pattern pattern = Pattern.compile("<a\\s.*?href=\"(.+?)\".*?>(.+?)</a>");
        Matcher matcher = pattern.matcher(page);

        while (matcher.find()) {
            urlList.add(matcher.group());
        }
        return urlList;
    }

    private static String makeFileName(String urlName) {
        return urlName.substring(urlName.lastIndexOf('/') + 1, urlName.lastIndexOf('.')) + ".txt";
    }
}