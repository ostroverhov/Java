package by.ostroverhov.lesson18.domain;

public class Programmer {
    private String name;
    private int salary;
    private Mastery mastery;
    private String language;
    private Company company;

    public static class Builder {
        private Programmer programmer = new Programmer();

        public Builder name(String name) {
            programmer.name = name;
            return this;
        }

        public Builder salary(int salary) {
            programmer.salary = salary;
            return this;
        }

        public Builder mastery(Mastery mastery) {
            programmer.mastery = mastery;
            return this;
        }

        public Builder mastery(String mastery) {
            programmer.mastery = Mastery.valueOf(mastery);
            return this;
        }

        public Builder language(String language) {
            programmer.language = language;
            return this;
        }

        public Builder company(Company company) {
            programmer.company = company;
            return this;
        }

        public Programmer build() {

            return programmer;
        }
    }

    @Override
    public String toString() {
        return "\nProgrammer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", mastery='" + mastery + '\'' +
                ", language='" + language + '\'' +
                ", company=" + company +
                '}';
    }
}