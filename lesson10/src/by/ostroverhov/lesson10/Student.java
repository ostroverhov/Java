package by.ostroverhov.lesson10;

import java.util.Date;

public class Student {
    private String name;
    @Generate
    private int age;
    private boolean isDismissed;
    private Date dateBirthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDismissed(boolean dismissed) {
        isDismissed = dismissed;
    }

    public void setDateBirthday(Date dateBirthday) {
        this.dateBirthday = dateBirthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isDismissed=" + isDismissed +
                ", dateBirthday=" + dateBirthday +
                '}';
    }
}
