package by.ostroverhov.lesson13;

import by.ostroverhov.lesson13.model.Customers;
import by.ostroverhov.lesson13.sax.CustomersReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CustomersReader customersReader = new CustomersReader("customers.xml");
        Customers customers = customersReader.read();
        System.out.println(customers);
        customers.sortByName();
        System.out.println(customers);
    }
}