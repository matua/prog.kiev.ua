package OOP.Lesson8.One;
/*
Created by matua on 16.06.2018 at 16:00
*/

import java.io.Serializable;

public class Human implements Serializable {
    private String firstName;
    private String lastName;
    private String patronymic;
    private int age;
    private boolean sex; //true for male, false for female

    public Human() {
    }

    public Human(String firstName, String lastName, String patronymic, int age, boolean sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
