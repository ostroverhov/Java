package by.ostroverhov.lesson5.student;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StudentsList students = new StudentsList(2);
        students.input();
        System.out.println(Arrays.toString(students.getStudentsList()));
    }
}
