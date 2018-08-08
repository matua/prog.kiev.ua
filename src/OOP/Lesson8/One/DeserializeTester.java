package OOP.Lesson8.One;
/*
Created by matua on 29.07.2018 at 19:07
*/

import java.io.File;
import java.io.IOException;

public class DeserializeTester {
    public static void main(String[] args) {
        File file = new File("/Users/matua/Downloads/GroupsSerialized.txt");
        Group []deserializedGroup = null;

        try {
            deserializedGroup = University.deserializeGroups(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        for(Group group:deserializedGroup) {
            System.out.println(group);
        }
    }
}
