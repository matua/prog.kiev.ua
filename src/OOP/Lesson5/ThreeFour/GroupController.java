package OOP.Lesson5.ThreeFour;
/*
Created by matua on 10.07.2018 at 10:05
*/

import java.io.File;
import java.io.IOException;

public class GroupController {
    public static void main(String[] args) {
        GroupDao groupDao = new GroupDaoImpl();
        Group group1 = null;

        //loading group from file
        try {
             group1 = groupDao.loadGroup(new File("savedGroup.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(group1);

        //saving group to file
        try {
            groupDao.saveGroup(group1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
