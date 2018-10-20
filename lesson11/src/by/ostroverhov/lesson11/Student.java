package by.ostroverhov.lesson11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String name;
    private Date birthDate;
    private boolean pay;

    public Student(String name, Date birthDate, boolean pay) {
        this.name = name;
        this.birthDate = birthDate;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", pay=" + pay +
                '}';
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
