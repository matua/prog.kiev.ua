package OOP.Lesson10.One;
/*
Created by matua on 16.06.2018 at 16:35
*/

import java.util.Collections;

public class SchoolTester {
    public static void main(String[] args) {
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
        Student eleven = new Student("Nina", "Nevlezay", "Pardonovna", 20, false, false, "Economics", 3);

        Group group = new Group();
        System.out.println(group);
        group.addStudent(one);
        group.addStudent(two);
        group.addStudent(three);
//        group.searchStudent("Kovsh");
//        group.searchStudent("Klushkin");
//        group.searchStudent("Klushkina");
//        group.deleteStudent("Terkin");
//        System.out.println(group);
//        group.deleteStudent("Terkin");
//        group.deleteStudent("Terkin");
//        group.deleteStudent("Terkin");
//        group.addStudent(four);
//        group.addStudent(four);
//        System.out.println(group);
        group.addStudent(five);
        group.addStudent(six);
        group.addStudent(seven);
        group.addStudent(eight);
        group.addStudent(nine);
        group.addStudent(ten);
//        System.out.println(group);
//        group.deleteStudent("Mikroskop");
//        System.out.println(group);
//        group.addStudent(eight);
//        System.out.println(group);
//        group.addStudent(nine);
//        group.addStudent(nine);
//        group.addStudent(one);
//        group.addStudent(eleven);
//        System.out.println(group);
//        group.searchStudent("Kovsh");
//        group.deleteStudent("Kovsh");
//        group.searchStudent("Kovsh");
//        group.deleteStudent("Kovsh");
//        group.addStudent(ten);
//        group.searchStudent("Kovsh");
//        group.addStudent(Group.userInputStudent());
//        System.out.println(group);

        //sorting by age
        Collections.sort(group.getGroup(), (a, b) -> {
            int result = 0;
            if (a != null && b != null) {
                if (a.getAge() < b.getAge()) {
                    result = -1;
                } else if (a.getAge() > b.getAge()) {
                    result = 1;
                } else {
                    result = 0;
                }
            }
            return result;
        });

        System.out.println("\nSORTING BY AGE");
        System.out.println(group);

        //sorting by name
        Collections.sort(group.getGroup(), ((a, b) -> {
            int result = 0;
            if (a != null && b != null) {
            result = a.getLastName().compareToIgnoreCase(b.getLastName());
            }
            return result;}
            ));

        System.out.println("SORTING BY NAME");
        System.out.println(group);

        //sorting by sex
        Collections.sort(group.getGroup(), ((a, b) -> {
            int result = 0;
            {
                if (a != null && b != null) {
                    if (a.isSex()) {
                        result = -1;
                    }
                    else {
                        result = 1;
                    }
                }
            }
            return result;
        }));

        System.out.println("SORTING BY SEX");
        System.out.println(group);
        System.out.println("VOENKOM INTERFACE METHOD");
        System.out.println(group.overEighteen());

        //Testing a filter method that implements stream API
        System.out.println(group.sortedLastNameByStartingLetter('L'));
    }
}
