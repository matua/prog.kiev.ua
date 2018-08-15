package OOP.Lesson10.One;
/*
Created by matua on 10.07.2018 at 9:54
*/

import java.io.File;
import java.io.IOException;

public interface GroupDao {
    void saveGroup(Group group) throws IOException;
    Group loadGroup(File file) throws IOException;
}
