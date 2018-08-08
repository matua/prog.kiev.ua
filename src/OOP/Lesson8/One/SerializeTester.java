package OOP.Lesson8.One;
/*
Created by matua on 29.07.2018 at 18:51
*/

import java.io.File;
import java.io.IOException;

public class SerializeTester {
    public static void main(String[] args) {
        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        Student one = new Student("Vasiliy", "Terkin", "Ivanovich", 21, true, false, "Law", 3);
        Student two = new Student("Nikola", "Boyko", "Bogdanovich", 21, true, false, "Medical", 4);
        Student three = new Student("Valentina", "Klushkina", "Ivanovna", 19, false, true, "Medical", 2);
        Student four = new Student("Konstantin", "Mudko", "Gorelovich", 17, true, false, "Law", 1);
        Student five = new Student("Merkuri", "Kozlikin", "Zateevich", 20, true, true, "Medical", 3);
        Student six = new Student("Pasta", "Lapshina", "Doshirakovna", 22, false, true, "Art", 5);
        Student seven = new Student("Avgustina", "Yulieva", "Martovna", 18, false, false, "Philosophy", 1);
        Student eight = new Student("Periskop", "Mikroskop", "Binokolevich", 21, true, false, "Medical", 4);
        Student nine = new Student("Agafon", "Hudoba", "Makarovich", 20, true, true, "Medical", 3);
        Student ten = new Student("Kuzma", "Kovsh", "Mironovich", 20, true, true, "Architectural", 3);

        group1.addStudent(one);
        group1.addStudent(two);
        group1.addStudent(three);

        group2.addStudent(four);
        group2.addStudent(five);
        group2.addStudent(six);

        group3.addStudent(seven);
        group3.addStudent(eight);
        group3.addStudent(nine);
        group3.addStudent(ten);

        System.out.println(group1);
        System.out.println(group2);
        System.out.println(group3);

        Group [] groups = {group1, group2, group3};



        File file = new File("/Users/matua/Downloads/GroupsSerialized.txt");
        try {
            University.serializeGroups(groups, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
