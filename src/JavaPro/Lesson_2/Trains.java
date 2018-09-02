package JavaPro.Lesson_2;
/*
Created by matua on 30.08.2018 at 19:33
*/

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Trains {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("/Users/matua/Downloads/Trains.xml"));

        NodeList listOfTrains = document.getElementsByTagName("train");

        List<Train> trains = new ArrayList<>();

        /*Extracting departure times of all the trains in the XML file and adding them to departures ArrayList<String>*/
        for (int i = 0; i < listOfTrains.getLength(); i++) {
            Element train = (Element) listOfTrains.item(i);

            //Getting the date of departure
            String dateString = train.getElementsByTagName("date")
                    .item(0)
                    .getTextContent();

            String[] dateDetails = dateString.split("\\.");

            //Getting details of departure to further compare with today's details
            int yearOfDeparture = Integer.parseInt(dateDetails[2]);
            int monthOfDeparture = Integer.parseInt(dateDetails[1]);
            int dateOfDeparture = Integer.parseInt(dateDetails[0]);

            //Getting today Calendar object
            Calendar today = Calendar.getInstance();

            //Getting the time of departure
            String departure = train.getElementsByTagName("departure")
                    .item(0)
                    .getTextContent();


            //Getting he first hour out of time of departure
            int hour = Integer.parseInt(departure.split(":")[0]);

            //If the hour equals to 15 or more than 15 and less than 19 and the date is TODAY then we create a Train object with the corresponding id and add it to the list
            if ((hour >= 15 && hour < 19)
                    &&
                    (today.get(Calendar.DATE) == dateOfDeparture)
                    &&
                    (today.get(Calendar.MONTH) == monthOfDeparture - 1)
                    &&
                    (today.get(Calendar.YEAR) == yearOfDeparture)
            ) {
                trains.add(new Train(train.getAttribute("id")));
            }
        }

        System.out.printf("Out of %d trains the following leave TODAY after 15:00 and before 19:00\n", listOfTrains.getLength());
        for (Train train : trains) {
            System.out.println(train);
        }

        addTrainToXML(new Train("London", "Paris", "02.09.2018", "18:58"), document, new File("/Users/matua/Downloads/Trains.xml"));
//        }
    }

    public static void addTrainToXML(Train train, Document document, File file) throws TransformerException {

        //Getting the last id of the train
        int lastTrainId = Integer.parseInt(document.getElementsByTagName("train").item(document.getElementsByTagName("train").getLength() - 1).getAttributes().item(0).getTextContent());

        Element root = document.getDocumentElement();
        Element trainElement = document.createElement("train");
        trainElement.setAttribute("id", String.valueOf(++lastTrainId));
        root.appendChild(trainElement);

        Element from = document.createElement("from");
        Element to = document.createElement("to");
        Element date = document.createElement("date");
        Element departure = document.createElement("departure");

        from.appendChild(document.createTextNode(train.getFrom()));
        to.appendChild(document.createTextNode(train.getTo()));
        date.appendChild(document.createTextNode(train.getDate()));
        departure.appendChild(document.createTextNode(train.getDeparture()));

        trainElement.appendChild(from);
        trainElement.appendChild(to);
        trainElement.appendChild(date);
        trainElement.appendChild(departure);

        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(domSource, streamResult);

        System.out.printf("Train with id = %d is added", lastTrainId);
    }
}

class Train {
    private String id;
    private String from;
    private String to;
    private String date;
    private String departure;

    public Train(String id) {
        this.id = id;
    }

    public Train(String from, String to, String date, String departure) {
        this.from = from;
        this.to = to;
        this.date = date;
        this.departure = departure;
    }

    public String getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDate() {
        return date;
    }

    public String getDeparture() {
        return departure;
    }

    @Override
    public String toString() {
        return "Train " +
                "id " + id;
    }
}
