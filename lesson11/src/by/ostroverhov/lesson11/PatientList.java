package by.ostroverhov.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientList {
    Scanner scanner = new Scanner(System.in);
    List<Patient> patients = new ArrayList<>();

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(){
        System.out.println("������� ���:");
        String name = scanner.next();
        System.out.println("������� �������:");
        String surname = scanner.next();
        System.out.println("������� ���� ��������:");
        String birthDate = scanner.next();
        System.out.println("������� �����:");
        boolean pay = scanner.nextBoolean();
        patients.add(new Patient(name, surname, birthDate, pay));
    }



}
