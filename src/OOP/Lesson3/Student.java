package OOP.Lesson3;
/*
Created by matua on 16.06.2018 at 16:07
*/

public class Student extends Human {
    private boolean nerd;
    private String faculty;
    private int yearofStudy;

    public Student(String firstName, String lastName, String patronymic, int age, boolean sex, boolean nerd, String faculty, int yearofStudy) {
        super(firstName, lastName, patronymic, age, sex);
        this.nerd = nerd;
        this.faculty = faculty;
        this.yearofStudy = yearofStudy;
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

    public int getYearofStudy() {
        return yearofStudy;
    }

    public void setYearofStudy(int yearofStudy) {
        this.yearofStudy = yearofStudy;
    }

    @Override
    public String toString() {
        return super.getLastName() + ' ' + super.getFirstName() + ' ' + super.getPatronymic() + "\n\t" + super.getAge() + ' ' +
                "years old\n\t" + (super.isSex()?"Male":"Female") +
                "\n\t" + (isNerd()?"is a nerd":"is not a nerd") +
                "\n\tstudies at faculty of '" + faculty + '\'' +
                "\n\tyear: " + yearofStudy;
    }
}
