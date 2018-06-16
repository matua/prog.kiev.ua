package OOP.Lesson3;
/*
Created by matua on 16.06.2018 at 16:35
*/

public class SchoolTester {
    public static void main(String[] args) {
        Student one = new Student("Vasiliy", "Terkin", "Ivanovich", 20, true, false, "Law", 3);
        Student two = new Student("Nikola", "Boyko", "Bogdanovich", 21, true, false, "Medical", 4);
        Student three = new Student("Valentina", "Klushkina", "Ivanovna", 18, false, true, "Medical", 2);
        Student four = new Student("Konstantin", "Mudko", "Gorelovich", 17, true, false, "Law", 1);
        Student five = new Student("Merkuri", "Kozlikin", "Zateevich", 22, true, true, "Medical", 3);
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
        group.deleteStudent("Terkin");
        System.out.println(group);
        group.deleteStudent("Terkin");
        group.deleteStudent("Terkin");
        group.deleteStudent("Terkin");
        group.addStudent(four);
        group.addStudent(four);
        System.out.println(group);
        group.addStudent(five);
        group.addStudent(six);
        group.addStudent(seven);
        group.addStudent(eight);
        group.addStudent(nine);
        group.addStudent(ten);
        System.out.println(group);
        group.deleteStudent("Mikroskop");
        System.out.println(group);
        group.addStudent(eight);
        System.out.println(group);
        group.addStudent(nine);
        group.addStudent(nine);
        group.addStudent(one);
        group.addStudent(eleven);
        System.out.println(group);



    }
}
