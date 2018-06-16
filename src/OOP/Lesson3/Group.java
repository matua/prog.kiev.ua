package OOP.Lesson3;
/*
Created by matua on 16.06.2018 at 16:15
*/

import java.util.Arrays;

public class Group {
    private Student [] group = new Student[10];

    public Group(Student[] group) {
        this.group = group;
    }

    public Group() {
    }

    public void addStudent(Student studentToAdd) {
        try {
            System.out.format("Trying to add %s to the group.......", studentToAdd.getLastName());
            for (int i = 0; i < group.length; i++) {
                if (group[i] == null) {
                    group[i] = studentToAdd;
                    System.out.format("Student %s is added.\n", studentToAdd.getLastName());
                    break;
                } else  if (group[i].equals(studentToAdd)){
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
            if (student.getLastName().equals(lastName) && student != null) {
                found = student;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        int groupSize = 0;
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                groupSize++;
            }
        }
        Student [] list = new Student[groupSize];
        int init = 0;
        for (int i = 0; i < group.length; i++) {
           if (group[i] != null) {
               list[init] = group[i];
               init++;
           }
        }
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 1; j < list.length - i; j++) {
                Student temp;
                if (list[j].getLastName().compareTo(list[j - 1].getLastName()) < 0) {
                    temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(System.lineSeparator());
        stringBuilder.append("Group members:");
        stringBuilder.append(System.lineSeparator());
        for (int i = 0; i < list.length; i++) {
            stringBuilder.append(i + 1 + ". ");
            stringBuilder.append(list[i].toString());
            stringBuilder.append(System.lineSeparator());
        }
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
}
