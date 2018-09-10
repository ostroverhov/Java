package by.ostroverhov.lesson5.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentsList implements Input, AverageAge {
    private static final Scanner SCANNER = new Scanner(System.in);

    private int size;
    private Student[] studentsList;

    public StudentsList(int size) {
        this.size = size;
        studentsList = new Student[size];
    }

    public Student[] getStudentsList() {
        return studentsList;
    }

    @Override
    public void input() {
        for (int i = 0; i < size; i++) {
            System.out.println("Введите имя: ");
            String name = SCANNER.next();
            System.out.println("Введите фамилию: ");
            String surname = SCANNER.next();
            System.out.println("Введите дату рождения dd-MM-yyyy: ");
            Date birthDate = parse(SCANNER.next());
            studentsList[i] = new Student(name, surname, birthDate);
        }
    }

   @Override
    public TimePeriod calculate() {
        return null;
    }

    private Date parse(String date) {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
}
