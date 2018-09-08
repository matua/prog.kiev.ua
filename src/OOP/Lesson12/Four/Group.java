package OOP.Lesson12.Four;
/*
Created by matua on 11.08.2018 at 12:18
*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

public class Group implements Voencom, Serializable {
    private List<Student> group;

    public Group(List<Student> group) {
        this.group = group;
    }

    public Group() {
        group = new ArrayList<>();
    }

    public List<Student> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Student> group) {
        this.group = group;
    }

    public static Student userInputStudent() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter student first name and press ENTER");
            String firstName = scanner.nextLine();

            System.out.println("Please enter student last name and press ENTER");
            String lastName = scanner.nextLine();

            System.out.println("Please enter student patronymic and press ENTER");
            String patronymic = scanner.nextLine();

            System.out.println("Please enter student sex (male or female) and press ENTER");
            String sexString = scanner.nextLine();

            System.out.println("Please enter yes if student is a nerd and no otherwise");
            String nerdString = scanner.nextLine();

            System.out.println("Please enter student faculty and press ENTER");
            String faculty = scanner.nextLine();

            System.out.println("Please enter student year of study and press ENTER");
            int yearOfStudy = scanner.nextInt();

            System.out.println("Please enter student age and press ENTER");
            int age = scanner.nextInt();

            boolean sex = false;
            boolean nerd = false;

            if (sexString.equals("male")) {
                sex = true;
            } else if (sexString.equals("female")) {
                sex = false;
            }

            if (nerdString.equals("yes")) {
                nerd = true;
            } else if (nerdString.equals("no")) {
                nerd = false;
            }
            Student student = new Student(firstName, lastName, patronymic, age, sex, nerd, faculty, yearOfStudy);
            return student;
        }
    }

    public void addStudent(Student studentToAdd) {
        System.out.format("Trying to add %s to the group.......", studentToAdd.getLastName());
        try {
            if (group.contains(studentToAdd)) {
                System.out.format("Student %s is already in the group.\n", studentToAdd.getLastName());
            } else if (group.size() == 10) {
                throw new NoMoreSpaceInGroupException();
            } else {
                group.add(studentToAdd);
                System.out.format("Student %s is added.\n", studentToAdd.getLastName());
            }
        } catch (NoMoreSpaceInGroupException e) {
            System.out.format("Unfortunately, there is no space for %s!!\n", studentToAdd.getLastName());
        }
    }

    public void deleteStudent(String lastName) {
        System.out.format("Trying to delete %s from the group.......", lastName);
        boolean exist = false;
        for (int i = 0; i < group.size(); i++) {
            if (group.get(i).getLastName().equals(lastName)) {
                exist = true;
                group.remove(group.get(i));
                System.out.format("Student %s is deleted.\n", lastName);
            }
        }
        if (!exist) {
            System.out.format("Student %s does not exist.\n", lastName);
        }
    }

    public Student searchStudent(String lastName) {
        Student found = null;
        for (Student student : group) {
            if (student.getLastName().equals(lastName)) {
                System.out.format("Student %s is found.\n", lastName);
                found = student;
            } else {
                System.out.format("Student %s is NOT found.\n", lastName);
            }
        }
        return found;
    }


    @Override
    public String toString() {
        if (group.size() == 0) {
            return "The group is empty." + System.lineSeparator();
        }
        //constructing a formatted OUTPUT
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Group members:");
        stringBuilder.append(System.lineSeparator());
        for (int i = 0; i < group.size(); i++) {
            stringBuilder.append(i + 1 + ". ");
            stringBuilder.append(group.get(i).toString());
            stringBuilder.append(System.lineSeparator());
        }
        return stringBuilder.toString();
    }

    @Override
    public Group overEighteen() {
        List<Student> soldiers = new ArrayList<>();

        for (Student student : group) {
            if (student.getAge() > 18) {
                soldiers.add(student);
            }
        }
        return new Group(soldiers);
    }

    public List<Student> sortedLastNameByStartingLetter(char startWith) {
        List<Student> result = group.stream()
                .filter(n -> n.getLastName().startsWith(String.valueOf(startWith).toUpperCase()))
                .collect(toList());
        return result;
    }
}
