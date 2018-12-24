package by.ostroverhov.lesson14;

import java.time.LocalDate;

public class Patient {
    private String name;
    private String surname;
    private LocalDate birthDate;
    private boolean ill;

    public Patient(String name, String surname, LocalDate birthDate, boolean ill) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.ill = ill;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public boolean isIll() {
        return ill;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", ill=" + ill +
                '}';
    }
}
