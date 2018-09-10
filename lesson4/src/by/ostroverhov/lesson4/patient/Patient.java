package by.ostroverhov.lesson4.patient;

public class Patient {
    private String name;
    private int age;
    private boolean illness;

    public Patient(String name, int age, boolean illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        StringBuilder out = new StringBuilder();
        out.append("пациент - ").append(name);
        out.append(" возвраст - ").append(age);
        out.append(" болеет или нет - ").append(illness);
        return out.toString();
    }
}
