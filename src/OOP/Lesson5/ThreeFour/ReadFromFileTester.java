package OOP.Lesson5.ThreeFour;
/*
Created by matua on 09.07.2018 at 21:17
*/

import java.io.File;
import java.io.IOException;

public class ReadFromFileTester {
    public static void main(String[] args) {

        Group createdGroup = null;
        try {
            createdGroup = Group.readFromFile(new File("savedGroup.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(createdGroup);
    }
}
