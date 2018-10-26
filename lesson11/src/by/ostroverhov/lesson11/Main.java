package by.ostroverhov.lesson11;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        PatientList patientList = new PatientList();
        patientList.getPatients().add(new Patient("ivan", "ivanov", "22-11-1990", true));

        patientList.addPatient();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.bin"))) {
            for (Patient patient : patientList.getPatients()) {
                dos.writeUTF(patient.getName());
                dos.writeUTF(patient.getSurname());
                dos.writeUTF(patient.getBirthDate());
                dos.writeBoolean(patient.isPay());
            }
        }

        try(DataInputStream fin = new DataInputStream(new FileInputStream("data.bin"))) {
            for (int i = 0; i < patientList.getPatients().size(); i++) {
                String name = fin.readUTF();
                String surname = fin.readUTF();
                String birthDate = fin.readUTF();
                boolean pay = fin.readBoolean();
                System.out.printf("Name: %s  Surname: %s  BirthDate: %s  Pay: %b",
                        name, surname, birthDate, pay);
                patientList.getPatients().add(new Patient(name, surname, birthDate, pay));
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}



