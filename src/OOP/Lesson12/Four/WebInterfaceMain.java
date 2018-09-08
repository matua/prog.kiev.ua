package OOP.Lesson12.Four;
/*
Created by matua on 24.08.2018 at 14:53
*/

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class WebInterfaceMain {

    public static void main(String[] args) {
        Student one = new Student("Vasiliy", "Terkin", "Ivanovich", 21, true, false, "Law", 3);
        Student two = new Student("Nikola", "Boyko", "Bogdanovich", 21, true, false, "Medical", 4);
        Student three = new Student("Valentina", "Klushkina", "Ivanovna", 19, false, true, "Medical", 2);
        List<Student> students = new ArrayList<>();
        students.add(one);
        students.add(two);
        students.add(three);

        Group group = new Group(students);

        String info = "<p>Those are the methods you can do with the existing group of students:</p>\n" +
                "<p>Student info:</p>\n" +
                "<form>\n" +
                "<p><input name=\"firstName\" type=\"text\" value=\"First Name\" /></p>\n" +
                "<p><input name=\"lastName\" type=\"text\" value=\"Last Name\" /></p>\n" +
                "<p><input name=\"patronymic\" type=\"text\" value=\"Patronymic\" /></p>\n" +
                "<p><input name=\"age\" type=\"text\" value=\"Age\" /></p>\n" +
                "</form><form>\n" +
                "<p><input checked=\"checked\" name=\"sex\" type=\"radio\" value=\"male\" /> Male <br /> <input name=\"sex\" type=\"radio\" value=\"female\" /> Female</p>\n" +
                "</form><form><input checked=\"checked\" name=\"sex\" type=\"radio\" value=\"male\" /> Nerd&nbsp;<br /> <input name=\"sex\" type=\"radio\" value=\"female\" /> Not nerd&nbsp;</form>\n" +
                "<p><input name=\"faculty\" type=\"text\" value=\"Faculty\" /></p>\n" +
                "<p><input name=\"yearOfStudy\" type=\"text\" value=\"Year of Study\" /></p>\n" +
                "<p><a title=\"addStudent\" href=\"/addStudent\">addStudent</a></p>\n" +
                "<p><input name=\"yearOfStudy\" type=\"text\" value=\"Year of Study\" /></p>\n" +
                "<p><a title=\"deleteStudent\" href=\"/deleteStudent\">deleteStudent</a></p>\n" +
                "<p><a title=\"searchStudent\" href=\"/searchStudent\">searchStudent</a></p>";
        try (ServerSocket soc = new ServerSocket(9999)) {
            while(5 == 5) {
                Socket clientSocket = soc.accept();
                MainClient cli = new MainClient(clientSocket, info);
            }
        } catch (IOException e) {
            System.out.println("Error to server Socket Open!!!");
        }
    }
}