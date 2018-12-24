package by.ostroverhov.lesson13.sax;

import by.ostroverhov.lesson13.model.Customer;
import by.ostroverhov.lesson13.model.Customers;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;

public class CustomersReaderTest {
    @Test
    public void readShouldRunSmoothly() throws IOException {
        CustomersReader customersReader = new CustomersReader("by\\itacademy\\lesson13\\sax\\customers.xml");
        Customers customers = customersReader.read();

        Customers expected = new Customers();
        expected.add(new Customer(0, "Ivan Ivanov", LocalDate.of(2015, 9, 25), LocalDate.of(2004, 10, 25), Arrays.asList("BMW 5", "Opel"), true));
        expected.add(new Customer(1, "Alex Petrov", LocalDate.of(2015, 1, 12), LocalDate.of(1998, 3, 24), Arrays.asList("Audi", "Citroen", "Toyota"), false));
        expected.add(new Customer(2, "Elena Sergeeva", LocalDate.of(2015, 5, 12), LocalDate.of(1999, 5, 2), Arrays.asList("Peugeot"), true));

        Assert.assertEquals(customers, expected);
    }

    @Test(expected = NullPointerException.class)
    public void readShouldBeInvalid() throws IOException {
        CustomersReader customersReader = new CustomersReader("by\\itacademy\\lesson13\\sax\\customers_invalid.xml");
        customersReader.read();
    }
}