package OOP.Lesson9.Two;
/*
Created by matua on 11.08.2018 at 12:18
*/

import java.io.Serializable;
import java.util.Objects;

public class Student extends Human implements Serializable {
    private boolean nerd;
    private String faculty;
    private int yearOfStudy;

    public Student(String firstName, String lastName, String patronymic, int age, boolean sex, boolean nerd, String faculty, int yearOfStudy) {
        super(firstName, lastName, patronymic, age, sex);
        this.nerd = nerd;
        this.faculty = faculty;
        this.yearOfStudy = yearOfStudy;
    }

    public boolean isNerd() {
        return nerd;
    }

    public void setNerd(boolean nerd) {
        this.nerd = nerd;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public String toString() {
        return super.getLastName() + ' ' + super.getFirstName() + ' ' + super.getPatronymic() + "\n\t" + super.getAge() + ' ' +
                "years old\n\t" + (super.isSex()?"Male":"Female") +
                "\n\t" + (isNerd()?"is a nerd":"is not a nerd") +
                "\n\tstudies at faculty of '" + faculty + '\'' +
                "\n\tyear: " + yearOfStudy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return nerd == student.nerd &&
                yearOfStudy == student.yearOfStudy &&
                Objects.equals(faculty, student.faculty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nerd, faculty, yearOfStudy);
    }
}
