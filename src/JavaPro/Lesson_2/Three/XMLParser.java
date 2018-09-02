package JavaPro.Lesson_2.Three;
/*
Created by matua on 02.09.2018 at 17:27
*/

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try {
            URL url = new URL("http://www.cbr.ru/scripts/XML_daily.asp");
            URLConnection connection = url.openConnection();
            try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "Windows-1251"))) {
                while (br.ready()) {
                    sb.append(br.readLine());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String xml = sb.toString();

        List<Currency> list = parse(xml);

        for (Currency currency : list) {
            System.out.println(currency);
        }
    }

    public static List<Currency> parse(String file) {
        List<Currency> currencyList = new ArrayList<>();
        try {
            Document document = loadXMLFromString(file);
            NodeList listOfCurrencies = document.getElementsByTagName("Valute");

            for (int i = 0; i < listOfCurrencies.getLength(); i++) {
                Element currency = (Element) listOfCurrencies.item(i);

                String valuteID = currency.getAttribute("ID");

                //Getting NumCode
                int numCode = Integer.parseInt(currency.getElementsByTagName("NumCode")
                        .item(0)
                        .getTextContent()
                );

                //Getting CharCode
                String charCode = currency.getElementsByTagName("CharCode")
                        .item(0)
                        .getTextContent();

                //Getting Nominal
                int nominal = Integer.parseInt(currency.getElementsByTagName("Nominal")
                        .item(0)
                        .getTextContent()
                );

                //Getting Name
                String name = currency.getElementsByTagName("Name")
                        .item(0)
                        .getTextContent();

                //Getting Value
                double value = parseSlavicStyleDouble(currency.getElementsByTagName("Value")
                        .item(0)
                        .getTextContent()
                );

                currencyList.add(new Currency(valuteID, numCode, charCode, nominal, name, value));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return currencyList;
    }

    public static Document loadXMLFromString(String xml) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        InputSource is = new InputSource(new StringReader(xml));
        return builder.parse(is);
    }

    public static double parseSlavicStyleDouble(String slavicDouble) {
        String [] partsOfTheDouble = slavicDouble.split(",");
        StringBuilder sb = new StringBuilder();

        sb.append(partsOfTheDouble[0]).append(".").append(partsOfTheDouble[1]);

        return Double.parseDouble(sb.toString());
    }
}
