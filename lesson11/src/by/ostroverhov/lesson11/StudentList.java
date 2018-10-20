package by.ostroverhov.lesson11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    private static final Scanner SCANNER = new Scanner(System.in);
    List<Student> ourStudents = new ArrayList<>();

    {
        ourStudents.add(new Student("Paul", parse("11.05.1995"), true));
        ourStudents.add(new Student("Michael", parse("01.07.1998"), true));
    }

    public void input() {
        System.out.println("Введите имя: ");
        String name = SCANNER.next();
        System.out.println("Введите дату рождения: ");
        Date birthDate = parse(SCANNER.next());
        System.out.println("Введите оплату: ");
        boolean pay = SCANNER.nextBoolean();
        ourStudents.add(new Student(name, birthDate, pay));
    }

    public void output() {
        for (Student student:ourStudents) {
            System.out.println(student);
        }
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
