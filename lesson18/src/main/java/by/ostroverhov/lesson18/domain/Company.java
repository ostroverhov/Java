package by.ostroverhov.lesson18.domain;

public class Company {
    private String name;

    public static class Builder {
        private Company company = new Company();

        public Builder name(String name) {
            company.name = name;
            return this;
        }

        public Company build() {
            return company;
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}