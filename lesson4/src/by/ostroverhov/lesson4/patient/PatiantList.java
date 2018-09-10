package by.ostroverhov.lesson4.patient;

import java.util.Arrays;
import java.util.Scanner;

public class PatiantList {
    private static final Scanner SCANNER = new Scanner(System.in);

    private Patient[] patients;
    private int size;

    public PatiantList(int size) {
        patients = new Patient[size];
        this.size = size;
    }

    public void input() {
        for (int i = 0; i < size; i++) {
            System.out.println("введите имя: ");
            String name = SCANNER.nextLine();
            System.out.println("введите возвраст: ");
            int age = SCANNER.nextInt();
            System.out.println("введите болен или нет (true/false): ");
            boolean illness = SCANNER.nextBoolean();
            SCANNER.nextLine();
            patients[i] = new Patient(name, age, illness);
        }
    }

    public void output() {
        System.out.println(this);
    }

    public void search(String name) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getName().equals(name)) {
                System.out.println(patients[i]);
            }
        }
    }

    public void search(int age) {
        for (int i = 0; i < size; i++) {
            if (patients[i].getAge() == age) {
                System.out.println(patients[i]);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < size; i++) {
            out.append(patients[i]).append("\n");
        }
        return out.toString();
    }
}
