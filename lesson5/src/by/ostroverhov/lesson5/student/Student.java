package by.ostroverhov.lesson5.student;

import java.util.Date;

public class Student implements Dateable {
    private String name;
    private String surname;
    private Date birthDate;

    public Student(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    @Override
    public Date date() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
