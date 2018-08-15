package OOP.Lesson10.One;
/*
Created by matua on 29.07.2018 at 13:00
*/

import java.io.*;

public class University {
    public static void serializeGroups(Group[] group, File file) throws IOException {
        System.out.println("Serializing...");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(group);
        }
    }

    public static Group[] deserializeGroups(File file) throws IOException, ClassNotFoundException {
        System.out.println("Deserializing...");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Group[] group = (Group[]) ois.readObject();
            return group;
        }
    }
}
