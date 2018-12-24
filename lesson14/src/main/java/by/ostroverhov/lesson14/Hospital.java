package by.ostroverhov.lesson14;

import by.ostroverhov.lesson14.Gson.deserializer.PatientDeserializer;
import by.ostroverhov.lesson14.Gson.serializer.BirthDateSerializer;
import by.ostroverhov.lesson14.Gson.serializer.IllnessSerializer;
import by.ostroverhov.lesson14.Gson.serializer.PatientSerializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hospital {
    private List<Patient> patients = new ArrayList<>();

    public void addPatients(Patient patient) {
        patients.add(patient);
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public String toJson() {
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Patient.class, new PatientSerializer())
                .registerTypeAdapter(new TypeToken<LocalDate>() {
                }.getType(), new BirthDateSerializer())
                .registerTypeAdapter(new TypeToken<Boolean>() {
                }.getType(), new IllnessSerializer())
                .create();
        return gson.toJson(this);
    }

    public void fromJson(String json) {
        Gson gson1 = new GsonBuilder()
                .registerTypeAdapter(Patient.class, new PatientDeserializer())
                .create();
        Hospital hospital = gson1.fromJson(json, Hospital.class);
        this.patients.addAll(hospital.getPatients());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hospital hospital = (Hospital) o;
        return Objects.equals(patients, hospital.patients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patients);
    }
}
