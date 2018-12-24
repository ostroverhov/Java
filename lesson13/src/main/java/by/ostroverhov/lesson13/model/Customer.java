package by.ostroverhov.lesson13.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Customer {
    private int id;
    private String name;
    private LocalDate lastOrder;
    private LocalDate dateOfBirth;
    private List<String> car;
    private boolean discount;

    public Customer(int id, String name, LocalDate lastOrder, LocalDate dateOfBirth, List<String> car, boolean discount) {
        this.id = id;
        this.name = name;
        this.lastOrder = lastOrder;
        this.dateOfBirth = dateOfBirth;
        this.car = car;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id &&
                discount == customer.discount &&
                Objects.equals(name, customer.name) &&
                Objects.equals(lastOrder, customer.lastOrder) &&
                Objects.equals(dateOfBirth, customer.dateOfBirth) &&
                Objects.equals(car, customer.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastOrder, dateOfBirth, car, discount);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastOrder=" + lastOrder +
                ", dateOfBirth=" + dateOfBirth +
                ", car=" + car +
                ", discount=" + discount +
                '}';
    }
}
