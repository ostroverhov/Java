package by.ostroverhov.lesson12;

public class Patient {
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
