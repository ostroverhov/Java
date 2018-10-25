package by.ostroverhov.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    List<Patient> patients = new ArrayList<>();

    public void addPatient(Patient newPatient){
        patients.add(newPatient);
    }

    public List<Patient> getPatients() {
        return patients;
    }
}
