package OOP.Lesson4;
/*
Created by matua on 16.06.2018 at 16:15
*/

import java.util.Scanner;

public class Group implements Voencom {
    private Student[] group = new Student[10];

    public Group(Student[] group) {
        this.group = group;
    }

    public Group() {
    }

    public Student[] getGroup() {
        return group;
    }

    public void setGroup(Student[] group) {
        this.group = group;
    }

    public static Student userInputStudent() {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter student first name and press ENTER");
            String firstName = scanner.nextLine();

            System.out.println("Please enter student last name and press ENTER");
            String lastName = scanner.nextLine();

            System.out.println("Please enter student patronymic and press ENTER");
            String patronymic = scanner.nextLine();

            System.out.println("Please enter student sex (male or female and press ENTER");
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
        try {
            System.out.format("Trying to add %s to the group.......", studentToAdd.getLastName());
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = studentToAdd;
                    System.out.format("Student %s is added.\n", studentToAdd.getLastName());
                    break;
                } else  if ((group[i].getLastName().equals(studentToAdd.getLastName())) && (group[i].getFirstName().equals(studentToAdd.getFirstName())) && (group[i].getPatronymic().equals(studentToAdd.getPatronymic())) && (group[i].getAge() == (studentToAdd.getAge())) && (group[i].getFaculty().equals(studentToAdd.getFaculty()))){
                    System.out.format("Student %s is already in the group.\n", studentToAdd.getLastName());
                    break;
                }
                if (i == group.length - 1){
                    throw new NoMoreSpaceInGroupException();
                }
            }

        } catch (NoMoreSpaceInGroupException e) {
//            e.printStackTrace();
            System.out.format("Unfortunately, there is no space for %s!!\n", studentToAdd.getLastName());
        }

    }

    public void deleteStudent(String lastName) {
        System.out.format("Trying to delete %s from the group.......", lastName);
        boolean exist = false;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                if (group[i].getLastName().equals(lastName)) {
                    exist = true;
                    group[i] = null;
                    System.out.format("Student %s is deleted.\n", lastName);
                }
            }
        }
        if (!exist) {
            System.out.format("Student %s does not exist.\n", lastName);
        }
    }

    public Student searchStudent(String lastName) {
        Student found = null;
        for (Student student : group) {
            if (student != null) {
                if (student.getLastName().equals(lastName)) {
                    System.out.format("Student %s is found.\n", lastName);
                    found = student;
                }
            }
        }
        if (found == null) {
            System.out.format("Student %s is not found.\n", lastName);
            return null;
        }
        else {
            return found;
        }
    }

    //getting the size of a Student group array if we remove NULL data
    private int groupSize() {
        int groupSize = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                groupSize++;
            }
        }
        return groupSize;
    }

    //making the an array of existing students from Student group array, not counting NULL data
    private Student[] existingStudentsArray() {
        Student[] list = new Student[groupSize()];
        int init = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                list[init] = group[i];
                init++;
            }
        }
        return list;
    }


    @Override
    public String toString() {
        Student[] list = existingStudentsArray();
        //constructing a formatted OUTPUT
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Group members:");
        stringBuilder.append(System.lineSeparator());
        for (int i = 0; i < list.length; i++) {
            stringBuilder.append(i + 1 + ". ");
            stringBuilder.append(list[i].toString());
            stringBuilder.append(System.lineSeparator());
        }
        //Checking if there stringbuilder information changed from "Group members:" to "Group members: + list of student(s). If the list is empty - printing "The group is empty.", or otherwise printing the Total number of students
        if (stringBuilder.toString().trim().equals("Group members:")) {
            return "The group is empty." + System.lineSeparator();
        } else {
            stringBuilder.append("-------------------------------");
            stringBuilder.append(System.lineSeparator());
            stringBuilder.append("Total: ");
            stringBuilder.append(list.length);
            stringBuilder.append(" student(s).\n");
            return stringBuilder.toString();
        }
    }

    @Override
    public Group overEighteen() {
        int numberOfBigGuys = 0;
        Student [] array = existingStudentsArray();
        for(Student student : array) {
            if (student.getAge() > 18) {
                numberOfBigGuys++;
            }
        }
        if (numberOfBigGuys == 0) {
            System.out.println("There are no people for the war traning");
            return null;
        }
        Student[] result = new Student[numberOfBigGuys];
        int init = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 18) {
                result[init] = array[i];
                init++;
            }
        }
        return new Group(result);
    }
}
