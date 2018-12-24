package by.ostroverhov.lesson13.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Customers {
    private List<Customer> customers;

    public Customers() {
        customers = new ArrayList<>();
    }

    public Customers(List<Customer> customers) {
        this.customers = customers;
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void sortByName() {
        Collections.sort(customers, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customers customers1 = (Customers) o;
        return Objects.equals(customers, customers1.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customers);
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customers=" + customers +
                '}';
    }
}