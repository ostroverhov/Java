package by.ostroverhov.lesson11;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Patient implements Serializable {

    private String name;
    private String surname;
    private String birthDate;
    private boolean pay;

    public Patient(String name, String surname, String birthDate, boolean pay) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public boolean isPay() {
        return pay;
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

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", pay=" + pay +
                '}';
    }
}
