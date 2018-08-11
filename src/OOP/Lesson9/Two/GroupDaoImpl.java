package OOP.Lesson9.Two;
/*
Created by matua on 10.07.2018 at 9:56
*/

import java.io.*;

public class GroupDaoImpl implements GroupDao {
    @Override
    public void saveGroup(Group group) throws IOException {
        File file = new File("/Users/matua/Downloads/savedToFile.csv");
        file.createNewFile();

            try (PrintWriter printWriter = new PrintWriter(new FileWriter(file))) {
                for(Student student : group.getGroup()) {
                    printWriter.print(student.getFirstName());
                    printWriter.print(", ");
                    printWriter.print(student.getLastName());
                    printWriter.print(", ");
                    printWriter.print(student.getPatronymic());
                    printWriter.print(", ");
                    printWriter.print(student.getAge());
                    printWriter.print(", ");
                    printWriter.print(student.isSex());
                    printWriter.print(", ");
                    printWriter.print(student.isNerd());
                    printWriter.print(", ");
                    printWriter.print(student.getFaculty());
                    printWriter.print(", ");
                    printWriter.print(student.getYearOfStudy());
                    printWriter.println();
                }
            }
    }

    @Override
    public Group loadGroup(File file) throws IOException {
            Group group = new Group();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
                while(bufferedReader.ready()) {
                    String [] data = bufferedReader.readLine().split(", ");
                    String firstName = data[0];
                    String lastName = data[1];
                    String patronymic = data[2];
                    int age = Integer.parseInt(data[3]);
                    boolean sex = Boolean.parseBoolean(data[4]);
                    boolean nerd = Boolean.parseBoolean(data[5]);
                    String faculty = data[6];
                    int year = Integer.parseInt(data[7]);
                    group.addStudent(new Student(firstName, lastName, patronymic, age, sex, nerd, faculty, year));
                }
            }
            return group;
    }
}
